<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<header style="height: 30px; background-color: darkorange">
		<b style="margin-left: 80px;">welcome to Home page.</b>
	</header>
	
	<div class="container">
	<img src="/images/unlock.png" style="height: 100px">
	<img src="/images/unlock.png" style="height: 110px">
	<img src="/images/unlock.png" style="height: 120px">
	<img src="/images/unlock.png" style="height: 130px">
	<hr/>
	
	<span  id="message"  style="color:red;font-size: 16px;font-weight: bold;">
           <marquee scrolldelay="100" direction="right">Home Page</marquee>  
    </span>
    <hr/>
   
    <h6 style="color: #14287a">${message}</h6><br>
    
     <div class="form-group">
		<a href="addMovie"><button type="submit" class="btn btn-info">Add Movie</button></a>
	</div>
    <div>
   	 	<img src="/images/download.jpeg" style="height:300px">
    </div>
    
</div>
</body>
</html>