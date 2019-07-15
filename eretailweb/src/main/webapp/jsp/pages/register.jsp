<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/jsp/common/header-contact.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.error {
	color: red;
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
									<li>User Registration</li>
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
					<div class="section_title">Register</div>
					<div class="section_subtitle">Register to the WebSite</div>
					<div class="contact_form_container">
						   <%-- <form action="/eretailweb/userregister.do" id="register_form" class="contact_form">
							<div class="row">
								<div class="col-xl-6">
							
									<label for="contact_name">UserId*</label> <input
										type="text" name="userId" class="contact_input">
										<errors name="uid" 	cssClass="error"/> 
								</div>
								<div class="col-xl-6">
								
									User Id<form:input path="uid" class="contact_input" />
										<form:errors path="uid" cssClass="error" />
									</div>
								
								<div class="col-xl-6 last_name_col">
								
									<label for="contact_last_name">Password*</label> <input
										type="text" name="pwd" class="contact_input">
										<errors name="uid" 	cssClass="error"/> 
										
								</div>
								<div class="col-xl-6">
								
									<label for="contact_name">First Name*</label> <input
										type="text" name="firstName" class="contact_input">
										<errors name="firstName" 	cssClass="error"/> 
										
								</div>
								<div class="col-xl-6 last_name_col">
								
									<label for="contact_last_name">Last Name*</label> <input
										type="text" name="lastName" class="contact_input">
										<errors name="lastName" 	cssClass="error"/> 
										
								</div>
								<div class="col-xl-6">
							
									<label for="contact_name">Middle Name*</label> <input
										type="text" name="middleName" class="contact_input">
										<errors name="middleName" 	cssClass="error"/> 
										
								</div>
								<div class="col-xl-6 last_name_col">
							
									<label for="contact_last_name">Email Address*</label> <input
										type="text" name="emailAddress" class="contact_input">
										<errors name="emailAddress" 	cssClass="error"/> 
										
								</div>
								<div class="col-xl-6">
							
									<label for="contact_name">Home Phone</label> <input
										type="text" name="homePhone" class="contact_input">
										<errors name="homePhone" 	cssClass="error"/> 
										
								</div>
								<div class="col-xl-6 last_name_col">
							
									<label for="contact_last_name">Work Phone</label> <input
										type="text" name="workPhone" class="contact_input">
										<errors name="workPhone" 	cssClass="error"/> 
								</div>
							</div>
							<div class="row">
								<div class="col-xl-6">
								
									<label for="mobilePhone">Mobile Phone</label> <input
										type="text" name="mobilePhone" class="contact_input">
										<errors name="mobilePhone" 	cssClass="error"/> 
										
								</div>
								<div class="col-xl-6 last_name_col">
								
									<label for="mobilePhone">Fax</label> <input
										type="text" name="fax" class="contact_input">
										<errors name="fax" 	cssClass="error"/> 
										
								</div>
								<div class="col-xl-6">
								
									<label for="fax">Status</label> <input
										type="text" name="status" class="contact_input">
										<errors name="status" 	cssClass="error"/> 
										
								</div>
								<div class="col-xl-6 last_name_col">
									
									<label for="createdBy">Created By</label> <input
										type="text" id="createdBy" class="contact_input">
										
								</div>
								
								<div class="col-xl-6 last_name_col">
									
									<label for="modifiedBy">Modified By</label> <input
										type="text" id="modifiedBy" class="contact_input">
										
								</div>
								
							</div>
							
							<button class="button contact_button">
								<span>Register</span></a>
							</button>
						</form>   --%>

  <form:form action="/eretailweb/userregister.do"  modelAttribute="user">
   	<div class="row">
   		<div class="col-xl-6">
   		<label for="contact_name">UserId*</label>
         <form:input path="userId" id="userId" class="contact_input"/> 
          <form:errors path="userId" cssClass="error" />
        </div>
        <div class="col-xl-6 last_name_col">
        <label for="contact_last_name">Password*</label>
          <form:input path="pwd" id="password" class="contact_input"/> 
            <form:errors path="pwd" cssClass="error" />
            </div>
            <div class="col-xl-6">
            <label for="contact_name">First Name*</label> 
         <form:input path="firstName" id="firstname" class="contact_input"/> 
          <form:errors path="firstName" cssClass="error" />
        </div>
        <div class="col-xl-6 last_name_col">
        <label for="contact_last_name">Last Name*</label> 
           <form:input path="lastName" id="lastname" class="contact_input" /> 
            <form:errors path="lastName" cssClass="error" />
            </div>
            <div class="col-xl-6">
            <label for="contact_name">Middle Name</label> 
         <form:input path="middleName" id="middlename" class="contact_input" placeholder="Optional"/> 
          <form:errors path="middleName" cssClass="error" />
        </div>
        <div class="col-xl-6 last_name_col">
        <label for="contact_last_name">Email Address*</label>
          <form:input path="emailAddress" id="email" class="contact_input"/> 
            <form:errors path="emailAddress" cssClass="error" />
            </div>
            <div class="col-xl-6">
            <label for="contact_name">Home Phone</label>
       <form:input path="homePhone" id="homephone" class="contact_input" placeholder="Optional"/> 
          <form:errors path="homePhone" cssClass="error" />
        </div>
        <div class="col-xl-6 last_name_col">
        <label for="contact_last_name" >Work Phone</label>
           <form:input path="workPhone" id="workphone" class="contact_input" placeholder="Optional"/> 
            <form:errors path="workPhone" cssClass="error" />
            </div>
            <div class="col-xl-12">
            <label for="mobilePhone">Mobile Phone</label>
        <form:input path="mobilePhone" id="mobilephone" class="contact_input"/> 
          <form:errors path="mobilePhone" cssClass="error" />
        </div>
       <%--  <div class="col-xl-6 last_name_col">
        <label for="contact_name">Fax</label>
            <form:input path="fax" class="contact_input"/> 
            <form:errors path="fax" cssClass="error" />
            </div> --%>
          <%--   <div class="col-xl-6">
            <label for="contact_name">Status</label>
          <form:input path="status" class="contact_input"/> 
          <form:errors path="status" cssClass="error" />
        </div> --%>
         <%-- <div class="col-xl-6 last_name_col">
         <label for="createdBy">Created By</label>
            <form:input path="createdBy" class="contact_input"/> 
            <form:errors path="createdBy" cssClass="error" />
            </div>
         <div class="col-xl-6 last_name_col">
            <label for="modifiedBy">Modified By</label> 
           <form:input path="modifiedBy" class="contact_input"/> 
            <form:errors path="modifiedBy" cssClass="error" />
            </div> --%>
        </div>
			<button class="button contact_button" id="btn">
				<span>Register</span>
			</button>
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