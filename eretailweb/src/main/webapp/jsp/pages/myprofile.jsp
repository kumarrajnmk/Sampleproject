
<%@include file="/jsp/common/header-contact.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
<script>

function makefieldseditable()
{
	document.getElementById("uid").readOnly=false;
	document.getElementById("firstName").readOnly=false;
	document.getElementById("lastName").readOnly=false;
	document.getElementById("mobilePhone").readOnly=false;
	document.getElementById("status").readOnly=false;
	document.getElementById("pwd").readOnly=false;
	document.getElementById("emailAddress").readOnly=false;

}

</script>

</head>

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
									<li>My Profile</li>
								</ul> 	
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
  <div class="contact" >
	<div class="container">
		<div class="row">
			<!-- Register -->
			<div class="col-lg-8 contact_col">
				<div class="get_in_touch">
					<div class="section_title">View Profile</div>
					<div class="section_subtitle">To view the website</div>
					<div class="contact_form_container">
<form:form action="/eretailweb/updateUserProfile.do" method="POST" modelAttribute="user">

			<div class="row">
							
				<div class="col-xl-6">
						<label for="contact_last_name">User Id</label>
							<form:input path="userId" class="contact_input"/>
							<form:errors path="userId" 	cssClass="error"/> 
                 </div>
						<div class="col-xl-6 last_name_col">	
							<label for="contact_last_name">First Name*</label>
							<form:input path="firstName" class="contact_input"/>
							<form:errors path="firstName" 	cssClass="error"/> 
						</div>
				</div>
				<div class="row">
				      <div class="col-xl-6 last_name_col">	
							<label for="contact_last_name">Last Name*</label>
							<form:input path="lastName" class="contact_input"/>
							<form:errors path="lastName" 	cssClass="error"/> 
						</div>
						<div class="col-xl-6 last_name_col">	
							<label for="contact_last_name">Mobile Phone</label>
							<form:input path="mobilePhone" class="contact_input"/>
							<form:errors path="mobilePhone" 	cssClass="error"/> 
						</div>
				</div>
				<div class="row">
						<%-- <div class="col-xl-6 last_name_col">	
							<label for="contact_last_name">Status</label>
							<form:input path="status" class="contact_input"/>
							<form:errors path="status" 	cssClass="error"/> 
						</div>
 --%>							<div class="col-xl-12 last_name_col">	
							<label for="contact_last_name">Email Address</label>
							<form:input path="emailAddress" class="contact_input"/>
							<form:errors path="emailAddress" 	cssClass="error"/> 
						</div>
			</div>
						<button class="button contact_button">
								<span>Update</span>
							
							</button>
						</form:form>
						</div>
						</div>
						</div>
						</div>
						</div>
						</div>
						<%@include file="/jsp/common/footer.jsp"%>
						</html>
						