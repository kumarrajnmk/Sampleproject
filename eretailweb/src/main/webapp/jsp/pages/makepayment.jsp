<%@include file="/jsp/common/header-checkout.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<head>
<style>
.error {
	color: red;
}

body {
	font-family: Arial;
	font-size: 17px;
	padding: 20px;
}

* {
	box-sizing: border-box;
}

.row {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	-ms-flex-wrap: wrap; /* IE10 */
	flex-wrap: wrap;
	margin: 0 -16px;
}

.col-25 {
	-ms-flex: 25%; /* IE10 */
	flex: 25%;
}

.col-50 {
	-ms-flex: 50%; /* IE10 */
	flex: 50%;
}

.col-75 {
	-ms-flex: 75%; /* IE10 */
	flex: 75%;
}

.col-25, .col-50, .col-75 {
	padding: 0 16px;
}

.container {
	background-color:;
	padding: 5px 20px 15px 20px;
	border:;
	border-radius: 3px;
}

input[type=text] {
	width: 100%;
	margin-bottom: 20px;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

label {
	margin-bottom: 10px;
	display: block;
}

.icon-container {
	margin-bottom: 20px;
	padding: 6px 0;
	font-size: 24px;
}

.btn {
	background-color:;
	color:;
	padding: 10px;
	margin: 37px 0;
	border: none;
	width: 20%;
	border-radius: 2px;
	cursor: pointer;
	font-size: 17px;
}

.btn:hover {
	background-color: white;
}

a {
	color: #2196F3;
}

hr {
	border: 1px solid lightgrey;
}

span.price {
	float: right;
	color: grey;
}

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
@media ( max-width : 800px) {
	.row {
		flex-direction: column-reverse;
	}
	.col-25 {
		margin-bottom: 20px;
	}
}
</style>
</head>
<!-- Home -->
<body>
	<div class="home">
		<div class="home_container">
			<div class="home_background"
				style="background-image: url(/eretailweb/static/images/cart.jpg)"></div>
			<div class="home_content_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="home_content">
								<div class="breadcrumbs">
									<ul>
										<li><a href="index.html">Home</a></li>
										<li><a href="cart.html">Shopping Cart</a></li>
										<li><a href="cart.html">Checkout</a></li>
										<li>Payment</li>
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

				<!-- Payment -->
				<div class="col-lg-8 contact_col">
					<div class="get_in_touch">
						<div class="section_title">Credit/Debit Card Details</div>
						<div class="section_subtitle">Accepted Cards</div>
						<div class="icon-container">
							<i class="fa fa-cc-visa" style="color: navy;"></i> <i
								class="fa fa-cc-amex" style="color: blue;"></i> <i
								class="fa fa-cc-mastercard" style="color: red;"></i> <i
								class="fa fa-cc-discover" style="color: orange;"></i>
						</div>
						<div class="contact_form_container">
							<!-- 						<form action="#" id="payment_form" class="contact_form">
 -->
							<form:form method="POST"  action="addUser" modelAttribute="employee">
								<form:hidden path="idx" />

								<div class="row">
									<div class="col-xl-6">
										<!-- Name -->
										<label for="contact_name"><font color=black size=4>Name
												on card*</font></label>
										<!-- <input
										type="text" id="contact_name" class="contact_input"
										required="required"> -->
										
										<form:input path="name" />
										<form:errors path="name" cssClass="error" />
									</div>
									<!-- <div class="col-xl-6 last_name_col">
									Last Name
									<label for="contact_last_name">Last Name*</label> <input
										type="text" id="contact_last_name" class="contact_input"
										required="required">
								</div> -->
								</div>
								<div class="row">
									<div class="col-xl-6">
										<!-- Name -->
										<label for="emailAddress"><font color=black size=4>Card
												Number*</font></label>
										<!-- input
										type="text" id="emailAddress" class="contact_input"
										required="required"> -->
										<form:input path="description" />
										<form:errors path="description" cssClass="error" />
									</div>
									<!-- <div class="col-xl-6 last_name_col">
									Last Name
									<label for="homePhone">Home Phone*</label> <input
										type="text" id="homePhone" class="contact_input"
										required="required">
								</div> -->
								</div>
								<div class="row">
									<div class="col-xl-6">
										<!-- Name -->
										<label for="emailAddress"><font color=black size=4>Expiration
												Date*</font></label>
										<!--  <input
										type="text" id="emailAddress" class="contact_input"
										required="required"> -->
									</div>
								</div>
								<div class="row">
									&nbsp;&nbsp;&nbsp;
									<div class="col-xs-6">
										<select class="form-control col-sm-10" name="expiry-month"
											id="expiry-month">
											<option>Month</option>
											<option value="01">Jan (01)</option>
											<option value="02">Feb (02)</option>
											<option value="03">Mar (03)</option>
											<option value="04">Apr (04)</option>
											<option value="05">May (05)</option>
											<option value="06">June (06)</option>
											<option value="07">July (07)</option>
											<option value="08">Aug (08)</option>
											<option value="09">Sep (09)</option>
											<option value="10">Oct (10)</option>
											<option value="11">Nov (11)</option>
											<option value="12">Dec (12)</option>
										</select>
									</div>
									<div class="col-xs-10">
										<select class="form-control" name="expiry-year">
										    <option value="12">2012</option>
											<option value="13">2013</option>
											<option value="14">2014</option>
											<option value="15">2015</option>
											<option value="16">2016</option>
											<option value="17">2017</option>
											<option value="18">2018</option>
											<option value="19">2019</option>
											<option value="20">2020</option>
											<option value="21">2021</option>
											<option value="22">2022</option>
											<option value="23">2023</option>
										</select>
									</div>
								</div>
								<br>
								<div class="row">
									<div class="col-xl-3">
										<!-- Name -->
										<label for="contact_name"><font color=black size=4>Card
												CVV*</font></label>
										<!-- 					<input type="text" id="contact_name" class="contact_input" required="required">
 -->
										<form:input path="modifiedBy" />
										<form:errors path="modifiedBy" cssClass="error" />
									</div>
								</div>
								<input class="button contact_button" id="btn" type="submit" value="Update">
							
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
<%@include file="/jsp/common/footer.jsp"%>
