<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@include file="/jsp/common/header-contact.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<html>
<head>
<style>
.error {
	color: red;
	font-family: monospace;
}
</style>
</head>

<body>
	<!-- Home -->
	<div class="home">
		<div class="home_container">
			<div class="home_background"
				style="background-image: url(/eretailweb/static/images/contact.jpg)"></div>
			<div class="home_content_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="home_content">
								<div class="breadcrumbs">
									<ul>
										<li><a href="index.html">Home</a></li>
										<li>Signon</li>

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

				<!-- Register -->
				<div class="col-lg-8 contact_col">
					<div class="get_in_touch">
						<div class="section_title">Signon</div>
						<div class="section_subtitle">Signon to the WebSite</div>
						<div class="contact_form_container">
				 			
	 						  <form:form action="/eretailweb/resetPassword.do"
								modelAttribute="user" method="POST">

								<div class="row">
									<div class="col-xl-6">
									<label for=emailAddress">Enter Email Address</label>
									<form:input path="emailAddress" class="contact_input" />
										<form:errors path="emailAddress" cssClass="message" />
									</div>
</div>
							
							
								
								<button class="button contact_button" type="submit">	Reset Password</span>
								</button>  ${error}
								
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>


<%@include file="/jsp/common/footer.jsp"%>
</html>




 