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
										<li><a href="index.html">Resetpassword</a></li>
										<li>New Password</li>
										
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
						<div class="section_title">New Password</div>
						<div class="section_subtitle">Enter New Password Below</div>
						<div class="contact_form_container">
							<form action="#" id="register_form" class="contact_form" modelAttribute="userjdbc" >
						
								<div class="row">
									<div class="col-xl-6">
										<!-- Name -->
										<label for=mobilephone">mobile phone</label> <input
											type="text" id="mobilephone" class="contact_input"
											required="required">
									</div>
								</div>
								<div class="row">
									<div class="col-xl-6 last_name_col">
										<!-- Last Name -->
										<label for="newpassword">enter new Password*</label> <input
											type="text" id="newpassword" class="contact_input"
											required="required">
									</div>
								</div>
			                  
								<button class="button contact_button">
									 <span> <a href="/eretailweb/setnewpassword.do">Save changes</a></span>
							</form>
						</div><br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span><a href="/eretailweb/jsp/common/index-sample.jsp">Skip</a></span>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<%@include file="/jsp/common/footer.jsp"%>
