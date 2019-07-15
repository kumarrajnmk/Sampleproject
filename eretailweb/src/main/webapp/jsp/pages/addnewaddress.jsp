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
										<li>Address</li>
										
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<div class="contact">
	<div class="container">
		<div class="row">
			<!-- Register -->
			<div class="col-lg-8 contact_col">
				<div class="get_in_touch">
					<div class="section_title">Shipping Address</div>
					<div class="section_subtitle">Add New Address</div>
					<div class="contact_form_container">
						<form action="#" id="register_form" class="contact_form">
							<div class="row">
								<div class="col-xl-6">
									<!-- Name -->
									<label for="name">Full Name*</label> <input
										type="text" id="name" class="contact_input"
										required="required" >
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="streetAddress1">StreetAddress1</label> <input
										type="text" id="streetAddress1" class="contact_input"
										required="required">
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="streetAddress2">StreetAddress2</label> <input
										type="text" id="streetAddress2" class="contact_input"
										required="required">
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="city">City</label> <input
										type="text" id="city" class="contact_input"
										required="required">
								</div>
							
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="state">State</label> <input
										type="text" id="state" class="contact_input"
										required="required">
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="zipCode">Zipcode</label> <input
										type="text" id="zipCode" class="contact_input"
										required="required">
								</div>
							</div>
							<div class="row">
								<div class="col-xl-6">
									<!-- Name -->
									<label for="country">Country</label> <input
										type="text" id="country" class="contact_input"
										required="required">
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="createdBy">Created By</label> <input
										type="text" id="createdBy" class="contact_input"
										required="required">
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="modifiedBy">Modified By</label> <input
										type="text" id="modifiedBy" class="contact_input"
										required="required">
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="userUid">User Id</label> <input
										type="text" id="userUid" class="contact_input"
										required="required">
								</div>
							</div>
							
							<div class="button order_button"><a href="/eretailweb/makepayment1.do">Continue</a></div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

