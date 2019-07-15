package com.nmk.ecomm.api.log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ReadListener;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LoggingFilter implements Filter {
	private static final Logger LOGGER = Logger.getLogger(LoggingFilter.class);
	private boolean dumpRequest;
	private boolean dumpResponse;

	public void doFilter(final ServletRequest servletRequest, final ServletResponse servletResponse,
			final FilterChain filterChain) throws IOException, ServletException {

		final HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
		final BufferedRequestWrapper bufferedRequest = new BufferedRequestWrapper(httpRequest);

		if (dumpRequest) {
			LOGGER.info("REQUEST -> \n" + new String(bufferedRequest.getBuffer()));
		}

		final HttpServletResponse response = (HttpServletResponse) servletResponse;

		final ByteArrayPrintWriter pw = new ByteArrayPrintWriter();
		final HttpServletResponse wrappedResp = new HttpServletResponseWrapper(response) {

			@Override
			public PrintWriter getWriter() {
				return pw.getWriter();
			}

			@Override
			public ServletOutputStream getOutputStream() {
				return pw.getStream();
			}

		};

		filterChain.doFilter(bufferedRequest, wrappedResp);

		final byte[] bytes = pw.toByteArray();
		response.getOutputStream().write(bytes);
		/*
		 * if (dumpResponse) LOGGER.info("RESPONSE -> \n" + new String(bytes));
		 */
	}

	private static class ByteArrayServletStream extends ServletOutputStream {

		ByteArrayOutputStream baos;

		ByteArrayServletStream(final ByteArrayOutputStream baos) {
			this.baos = baos;
		}

		@Override
		public void write(final int param) throws IOException {
			baos.write(param);
		}

		@Override
		public boolean isReady() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setWriteListener(final WriteListener writeListener) {
			// TODO Auto-generated method stub

		}
	}

	private static class ByteArrayPrintWriter {

		private ByteArrayOutputStream baos = new ByteArrayOutputStream();

		private PrintWriter pw = new PrintWriter(baos);

		private ServletOutputStream sos = new ByteArrayServletStream(baos);

		public PrintWriter getWriter() {
			return pw;
		}

		public ServletOutputStream getStream() {
			return sos;
		}

		byte[] toByteArray() {
			return baos.toByteArray();
		}
	}

	private class BufferedServletInputStream extends ServletInputStream {

		ByteArrayInputStream bais;

		public BufferedServletInputStream(final ByteArrayInputStream bais) {
			this.bais = bais;
		}

		@Override
		public int available() {
			return bais.available();
		}

		@Override
		public int read() {
			return bais.read();
		}

		@Override
		public int read(final byte[] buf, final int off, final int len) {
			return bais.read(buf, off, len);
		}

		@Override
		public boolean isFinished() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isReady() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setReadListener(final ReadListener readListener) {
			// TODO Auto-generated method stub

		}
	}

	private class BufferedRequestWrapper extends HttpServletRequestWrapper {

		ByteArrayInputStream bais;

		ByteArrayOutputStream baos;

		BufferedServletInputStream bsis;

		byte[] buffer;

		public BufferedRequestWrapper(final HttpServletRequest req) throws IOException {
			super(req);
			final InputStream is = req.getInputStream();
			baos = new ByteArrayOutputStream();
			final byte buf[] = new byte[1024];
			int letti;
			while ((letti = is.read(buf)) > 0) {
				baos.write(buf, 0, letti);
			}
			buffer = baos.toByteArray();
		}

		@Override
		public ServletInputStream getInputStream() {
			try {
				bais = new ByteArrayInputStream(buffer);
				bsis = new BufferedServletInputStream(bais);
			} catch (Exception ex) {
				// ex.printStackTrace();
			}

			return bsis;
		}

		public byte[] getBuffer() {
			return buffer;
		}

	}

	@Override
	public void init(final FilterConfig filterConfig) throws ServletException {
		dumpRequest = true;
		// Boolean.valueOf(filterConfig.getInitParameter("dumpRequest"));
		dumpResponse = true;
		// Boolean.valueOf(filterConfig.getInitParameter("dumpResponse"));
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}
