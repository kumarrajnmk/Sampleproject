<%@include file="/jsp/common/header-contact.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!-- Home -->
	<div class="home">
		<div class="home_container">
			<div class="home_background" style="background-image:url(/eretailweb/static/images/contact.jpg)"></div>
			<div class="home_content_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="home_content">
								<div class="breadcrumbs">
									<ul>
										<li><a href="index.html">Home</a></li>
										<li>Contact</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Contact -->
	
	<div class="contact">
		<div class="container">
			<div class="row">

				<!-- Get in touch -->
				<div class="col-lg-8 contact_col">
					<div class="get_in_touch">
						<div class="section_title">Get in Touch</div>
						<div class="section_subtitle">Say hello</div>
						<div class="contact_form_container">
							<form action="/eretailweb/feedback.do" id="contact_form" class="contact_form">
								<div class="row">
									<div class="col-xl-6">
										<!-- Name -->
										<label for="contact_name">First Name*</label>
										<input type="text" id="contact_name" class="contact_input">
									</div>
									<div class="col-xl-6 last_name_col">
										<!-- Last Name -->
										<label for="contact_last_name">Last Name*</label>
										<input type="text" id="contact_last_name" class="contact_input">
									</div>
								</div>
								<div>
									<!-- Subject -->
									<label for="contact_company">Subject</label>
									<input type="text" id="contact_company" class="contact_input">
								</div>
								<div>
									<label for="contact_textarea">Message*</label>
									<textarea id="contact_textarea" class="contact_input contact_textarea"></textarea>
								</div>
								<button class="button contact_button"><span>Send Message</span></button>
							</form>
						</div>
					</div>
				</div>

				<!-- Contact Info -->
				<div class="col-lg-3 offset-xl-1 contact_col">
					<div class="contact_info">
						<div class="contact_info_section">
							<div class="contact_info_title">Marketing</div>
							<ul>
								<li>Phone: <span>+1-510-943-4090</span></li>
								<li>Email: <span>devi@nmkglobalinc.com </span></li>
							</ul>
						</div>
						<div class="contact_info_section">
							<div class="contact_info_title">Shippiing & Returns</div>
							<ul>
								<li>Phone: <span>+1-510-943-4090</span></li>
								<li>Email: <span>devi@nmkglobalinc.com</span></li>
							</ul>
						</div>
						<div class="contact_info_section">
							<div class="contact_info_title">Information</div>
							<ul>
								<li>Phone: <span>+1-510-943-4090</span></li>
								<li>Email: <span>devi@nmkglobalinc.com</span></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<%@include file="/jsp/common/footer.jsp"%>
