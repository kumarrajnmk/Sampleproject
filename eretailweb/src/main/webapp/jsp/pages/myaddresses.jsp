 <html>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@include file="/jsp/common/header-contact.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
 * {
	box-sizing: border-box;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}

/* Float four columns side by side */
 .column {
	float: left;
	width: 25%;
	padding: 0 10px;
}

/* Remove extra left and right margins, due to padding */
 .row {
	margin: 0 -5px;
	
} 

/* Clear floats after the columns */
 .row:after {
	content: "";
	display: table;
	clear: both;
} */ 

/* Responsive columns */
 @media screen and (max-width: 600px) {
	.column {
		width: 100%;
		display: block;
		margin-bottom: 40px;
	}
} 

/* Style the counter cards */
.card {
padding: 26px;
	text-align: left;
	
	
}

.error{color:red}  
</style>
<script>

function makefieldseditable()
{	
	
	document.getElementById("name").readOnly=false;
	document.getElementById("streetAddress1").readOnly=false;
	document.getElementById("streetAddress2").readOnly=false;
	document.getElementById("city").readOnly=false;
	document.getElementById("state").readOnly=false;
	document.getElementById("zipCode").readOnly=false;
	document.getElementById("createdBy").readOnly=false;
	document.getElementById("modifiedBy").readOnly=false;
	document.getElementById("userUid").readOnly=false;


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
									<li>My Addresses</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<body>


	<div class="row">
<div class="column" style="padding-left : 100px;
	padding-top: 40px";>
			<div class="card">
				<p><font color=black size=3>Siva,Sr nagar</font></p>
				<p><font color=black size=3>Ameerpet,Hyderabad</font></p>
				<p><font color=black size=3>Telangana,500016</font></p>
				<p><font color=black size=3>India</font></p>
			</div>
			<br>
				<button class="button contact_button" style="width: 140px">
					<span><a href="/eretailweb/jsp/pages/makepayment.jsp"">Deliver</a></span>
				</button>
				<button class="button contact_button" style="width: 80px" onclick="document.getElementById('demo').style.display='block'">
					<span><a href="#">Edit</a></span>
				</button>
	</div>

		<div class="column" style="padding-left : 100px; padding-top: 40px";>
			<div  class="card">
				<p><font color=black size=3>Vijay,himayatnagar</font></p>
				<p><font color=black size=3>Hyderabad</font></p>
				<p><font color=black size=3>Telangana,500038</font></p>
				<p><font color=black size=3>India</font></p>
			</div>
			<div>
				<br>
				<button class="button contact_button" style="width: 140px">
					<span><a href="/eretailweb/jsp/pages/makepayment.jsp"">Deliver</a></span>
				</button>
				<button class="button contact_button" style="width: 80px" onclick="document.getElementById('demo').style.display='block'">
					<span><a href="#">Edit</a></span>
				</button>
			</div>
		</div>
		<div class="column" style="padding-left : 100px; padding-top: 40px";>
			<div  class="card">
				<p><font color=black size=3>Rao,Khairatabad</font></p>
				<p><font color=black size=3>Kt Circle,Hyderabad</font></p>
				<p><font color=black size=3>Telangana,500020</font></p>
				<p><font color=black size=3>India</font></p>
			</div>
				<br>
				<button class="button contact_button" style="width: 140px">
					<span><a href="/eretailweb/jsp/pages/makepayment.jsp"">Deliver</a></span>
				</button>
				<button class="button contact_button" style="width: 80px" onclick="document.getElementById('demo').style.display='block'">
					<span><a href="#">Edit</a></span>
				</button>
		 </div>
	</div>
<div style="display: none;" id="demo">
	<div class="contact">
	<div class="container">
		<div class="row">
			<!-- Register -->
			<div class="col-lg-8 contact_col">
				<div class="get_in_touch">
					<div class="section_title">Address</div>
					<div class="section_subtitle">Add New Address</div>
					<div class="contact_form_container">
						<%--<form action="/eretailweb/addnewaddress.do" id="register_form" class="contact_form">
							<div class="row">
								<div class="col-xl-6">
									<!-- Name -->
									<label for="name">Full Name*</label>  <input
										type="text" name="name" class="contact_input"
										> 
										 <form:input path="name" class="contact_input"/> 
          								<form:errors path="name" cssClass="error" />
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="streetAddress1">StreetAddress1</label> <input
										type="text" name="streetAddress1" class="contact_input"
										>
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="streetAddress2">StreetAddress2</label> <input
										type="text" name="streetAddress2" class="contact_input"
										>
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="city">City</label> <input
										type="text" name="city" class="contact_input"
										>
								</div>
							
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="state">State</label> <input
										type="text" name="state" class="contact_input"
										>
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="zipCode">Zipcode</label> <input
										type="text" name="zipCode" class="contact_input"
										>
								</div>
							</div>
							<div class="row">
								<div class="col-xl-6">
									<!-- Name -->
									<label for="country">Country</label> <input
										type="text" name="country" class="contact_input"
										>
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="createdBy">Created By</label> <input
										type="text" name="createdBy" class="contact_input"
										 >
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="modifiedBy">Modified By</label> <input
										type="text" name="modifiedBy" class="contact_input"
										 >
								</div>
								<div class="col-xl-6 last_name_col">
									<!-- Last Name -->
									<label for="userUid">User Id</label> <input
										type="text" name="userUid" class="contact_input"
										 >
										 
								</div>
							</div>
							<!-- <button class="button contact_button" onclick="makefieldseditable()">
								<span><a href="#">Edit Address</a></span>
							
							</button> -->
							<button class="button contact_button">
								<span>Save NewAddress</span>
							</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</div>

</body>
<%@include file="/jsp/common/footer.jsp"%>
<!-- 
<script >
function setUp() {
    document.getElementById("menu").onclick = ;
}

</script> -->
</html>
 --%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<form:form action="/eretailweb/addnewaddress.do" modelAttribute="userAddress">  

							
<div class="row">
<div class="col-xl-6">
<label for="name">Full Name*</label>
<form:input path="name" class="contact_input"/> 
<form:errors path="name" cssClass="error"/>
</div>
<div class="col-xl-6 last_name_col">
<label for="name">Street Address1</label>
<form:input path="streetAddress1" class="contact_input"/>    
<form:errors path="streetAddress1" cssClass="error"/><br><br> 
</div> 
<div class="col-xl-6 last_name_col">
<label for="name">Street Address2</label>
<form:input path="streetAddress2" class="contact_input"/>    
<form:errors path="streetAddress2" cssClass="error"/><br><br> 
</div> 
<div class="col-xl-6 last_name_col">
<label for="name">City</label>
<form:input path="city" class="contact_input"/>    
<form:errors path="city" cssClass="error"/><br><br> 
</div> 
<div class="col-xl-6 last_name_col">
<label for="name">State</label>
<form:input path="state" class="contact_input"/>    
<form:errors path="state" cssClass="error"/><br><br> 
</div> 
<div class="col-xl-6 last_name_col">
<label for="name">Zipcode</label>
<form:input path="zipCode" class="contact_input"/>    
<form:errors path="zipCode" cssClass="error"/><br><br> 
</div> 
</div>
<div class="row">
	<div class="col-xl-6">
<label for="name">Country</label>
<form:input path="country" class="contact_input"/>    
<form:errors path="country" cssClass="error"/><br><br> 
</div>
<div class="col-xl-6 last_name_col">
<label for="name">ModifiedBy</label>
<form:input path="modifiedBy" class="contact_input"/>    
<form:errors path="modifiedBy" cssClass="error"/><br><br> 
</div> 
<button class="button contact_button">
<span>Save NewAddress</span>
</button>
</form:form>  
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</body>  
</html>  