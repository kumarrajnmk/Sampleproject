	<%@include file="/jsp/common/header-contact.jsp"%>
	<%@include file="/jsp/common/menu.jsp"%>
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
										<li>Forgot Userid</li>
										
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
						<div class="section_title">Forgot User id</div>
						<div class="section_subtitle">Registered mail</div>
						<div class="contact_form_container">
							<form action="#" id="register_form" class="contact_form">
								<div class="row">
									<div class="col-xl-6">
										<!-- Name -->
										<label for=userId">Enter your Email</label> <input
											type="text" id="userId" class="contact_input"
											required="required">
									</div>
								</div>	
								<button class="button contact_button">
									<span><a href="/eretailweb/forgotuserid.do">submit</a></span>
								</button>
								<!-- <li> <span class="psw">Forgot <a href="forgotpassword.jsp">password?</a></span></li> -->
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
<%@include file="/jsp/common/footer.jsp"%>