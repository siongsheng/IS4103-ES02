
<html>
	<head>
		<title></title>
		<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>
		<style type="text/css">
			.jumbotron {
			   padding-top: 20px;
			   padding-left: 5px;
			   align-self: center;
			}
			.container{
				padding-top: 10em; 
				max-width: 400px; 
			}
			.col-md-4{
				width: 400px;
			}
			.row{

			}
			.password{
				font-size: 10;
				color: grey;
			}
			.text{
				font-size: 10;
				color: grey;
			}
			.alert-danger{
				max-width: 400px; 
				text-align : center;
				
				margin: auto;
			}
		</style>

	</head>
	 <?php include('navigation.php'); ?>
	<body style="height:100%;
   width:100%;background-image: url(images/login.jpg); background-repeat:no-repeat;/*we want to have one single image not a repeated one*/  
   background-size:cover;">
	
		<form  action="handleLogin.php" method="post" role="form">
		<div class="container">
		
			<div class="jumbotron">
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" style="text-align: center;width:300px;">
					  
					 <font  color="black" style="font-size: 40px;text-align: center;">Login</font>
					</div>
					<div class="col-md-4"></div>
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" style="text-align: center;width:300px;">
					  
					 <?php if(ISSET($_SESSION['loginerror'])){
							if ($_SESSION["loginerror"] =='1' ){echo ' Invalid user/login';}
						 } ?>
					</div>
					<div class="col-md-4"></div>
				</div>
				
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" style="text-align: center;width:300px;">
					  
					  <input type="text" class="form-control" name="username" id="usr" placeholder="username">
					</div>
					<div class="col-md-4"></div>
				</div>
				<div class="row" style="padding-top: 10px;">
					<div class="col-md-4"></div>
					<div class="col-md-4" style="text-align: center;width:300px;">
				  	
				  		<input type="password" class="form-control" name="password" id="password" placeholder="password">
					</div>
					<div class="col-md-4"></div>
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" style="text-align: center;width:300px;">
				  		<p></p><input ID="submit" type="submit" class="btn btn-success" name="submit" style="width: 100%"></input>
					</div>
					<div class="col-md-4"></div>
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" style="color: #afafaf; text-align: center; font-size: 10;width:300px;">Not registered? <a href="#">Sign up!</a>
				  		
					</div>
					<div class="col-md-4"></div>
				</div>
				
			</div>
		
		</div>
		</form>

		<?php 
		if(isset($_POST['submit'])){
			if(empty($_POST['username'])){
				?><div class="alert alert-danger"><strong>Warning!</strong> Please enter your Username</div><br>
				 
			<?php
			}
			if(empty($_POST['password'])){
				
				?><div class="alert alert-danger" ><strong>Warning!</strong> Please enter your Password</div>
			<?php
			}
		
		}
		
	?>
	</body>
</html>
