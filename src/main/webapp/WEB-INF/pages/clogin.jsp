<!DOCTYPE html>
<html lang="en">
<head>
  <title>Login Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<header style="height: 30px; background-color: darkorange">
		<b style="margin-left: 80px;">welcome to login page.</b>
	</header>
	
	
	<div class="container">
	<img src="/images/login.png" style="height: 100px">
	<img src="/images/login.png" style="height: 110px">
	<img src="/images/login.png" style="height: 120px">
	<img src="/images/login.png" style="height: 130px">
	<hr/>
	
	<span  id="message"  style="color:red;font-size: 16px;font-weight: bold;">
           <marquee scrolldelay="100" direction="right"> Login Page</marquee>  
         </span>
    <hr/>
    <h6 style="color: #c2b311">${message}</h6><br>
    
    <form action="login" method="post">
	<div class="form-group">
		<label>Username</label>
		<input type="text" name="username" class="form-control" style="width:60%">
	</div>
	
	<div class="form-group">
		<label>Password</label>
		<input type="password" name="password" class="form-control" style="width:60%">
	</div>
	
	<div class="form-group">
		<button type="submit" class="btn btn-primary">Sign In</button>
		<button type="reset" class="btn btn-success">Clear All</button>
	</div>
	</form>
	</div>
	
</body>
</html>