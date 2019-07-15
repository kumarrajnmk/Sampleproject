<%@include file="/jsp/common/header-checkout.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>

	
	
	<!-- Home -->

	<div class="home">
		<div class="home_container">
			<div class="home_background" style="background-image:url(/eretailweb/static/images/cart.jpg)"></div>
			<div class="home_content_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="home_content">
								<div class="breadcrumbs">
									<ul>
										<li><a href="index.html">Home</a></li>
										<li><a href="card.html"></a>Reviews</li>
										<li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font Awesome Icon Library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial;
  margin: 0 auto; /* Center website */
  max-width: 1200px; /* Max width */
  padding: 10px;
}

.heading {
  font-size: 25px;
  margin-right: 25px;
  padding: 60px
  
}

.fa {
  font-size: 25px;
}

.checked {
  color: orange;
}

/* Three column layout */
.side {
  float: left;
  width: 15%;
  margin-top:10px;
  padding : 20px
  
}


.middle {
  margin-top:10px;
  float: left;
  width: 70%;
}

/* Place text to the right */
.right {
  text-align: right;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* The bar container */
.bar-container {
  width: 100%;
  background-color: #f1f1f1;
  text-align: center;
  color: white;
}

/* Individual bars */
.bar-5 {width: 60%; height: 18px; background-color: #4CAF50;}
.bar-4 {width: 30%; height: 18px; background-color: #2196F3;}
.bar-3 {width: 10%; height: 18px; background-color: #00bcd4;}
.bar-2 {width: 4%; height: 18px; background-color: #ff9800;}
.bar-1 {width: 15%; height: 18px; background-color: #f44336;}

/* Responsive layout - make the columns stack on top of each other instead of next to each other */
@media (max-width: 400px) {
  .side, .middle {
    width: 100%;
  }
  .right {
    display: none;
  }
}
</style>
</head>	
<br>
<body>

<span class="heading"><font color="black">User Rating</font></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star"></span>
&nbsp;&nbsp;&nbsp;&nbsp;<center><font color="black"><p>4.1 average based on 254 reviews.</font></p></center>
<hr style="border:3px solid #f1f1f1">
<font color="black">
<div class="row">
  <div class="side">
    <div>5 star</div>
  </div>
  <div class="middle">
    <div class="bar-container">
      <div class="bar-5"></div>
    </div>
  </div>
  <div class="side right">
    <div>150</div>
  </div>
  <div class="side">
    <div>4 star</div>
  </div>
  <div class="middle">
    <div class="bar-container">
      <div class="bar-4"></div>
    </div>
  </div>
  <div class="side right">
    <div>63</div>
  </div>
  <div class="side">
    <div>3 star</div>
  </div>
  <div class="middle">
    <div class="bar-container">
      <div class="bar-3"></div>
    </div>
  </div>
  <div class="side right">
    <div>15</div>
  </div>
  <div class="side">
    <div>2 star</div>
  </div>
  <div class="middle">
    <div class="bar-container">
      <div class="bar-2"></div>
    </div>
  </div>
  <div class="side right">
    <div>6</div>
  </div>
  <div class="side">
    <div>1 star</div>
  </div>
  <div class="middle">
    <div class="bar-container">
      <div class="bar-1"></div>
    </div>
  </div>
  <div class="side right">
    <div>20</div>
  </div>
  </font>
</div>
<p><font color="black">Customer Review</font></p>
    <p><font color="black">Display quality is top notch, overall the quality of the phone is very good. All metal body. Camera is good too. Touch smoothness is amazing. I will definitely recommend to buy this phone.
The USB is not type C, it is the old one. This is the only con that i found till now. It has got 2 nano sim slots and a dedicated memory card slot (2+1).
Other than the phone, amazon delivery service is a bit let down. It took 6 days to deliver the item from Calcutta to Assam. Whereas last year i bought 2 Redmi Note 4 ( for me and my uncle) from flipkart and mi india website, if you recall, Mi had flash sale every Friday. Hence i bought both handset on different dates. To my surprise i placed the order on Friday and received the item on Sunday on one occasion and Monday on the other occasion, which the shipped through ekart and FedEx respectively. Merely in 2-3 i got my phone. But Amazon's courier service is a total letdown as compared ekart and FedEx.</font></p>

</body>
<%@include file="/jsp/common/footer.jsp"%>

