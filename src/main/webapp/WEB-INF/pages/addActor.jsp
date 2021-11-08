<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Add Actor Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
   <header style="height: 30px;background-color: #8ca34b;"><b style="margin-left: 80px;">welcome to add actor page</b>
   </header><br>

   <div class="container">
    <img src="images/addactor.png" style="height: 200px;">

     <hr/>
       	<span id="message"
			style="color: blue; font-size: 16px; font-weight: bold;"> <marquee
				scrolldelay="100" direction="right">Add Actors Here</marquee>
		</span>
        <b style="color: red">${message}</b>
     <hr/>
     <form action="addActor" method="post">

     		 <input type="hidden" name="mid" value="${param.mid}">

		     <div class="form-group">
		     	 <label>Name</label>
		     	 <input type="text" name="name" class="form-control" style="width:50%">
		     </div>

		      <div class="form-group">
		     	 <label>Role</label>
		     	 <select name="role"  class="form-control" style="width:40%">
		     	 	<option>Hero</option>
		     	 		<option>Velain</option>
		     	 			<option>Support Actor</option>
		     	 			<option>Comedy</option>			
		     	 </select>
		     </div>

		      <div class="form-group">
		     	 <label>Photo</label>
		     	 <input type="text" name="photo" class="form-control" style="width:50%">
		     </div>

		      <div class="form-group">
		     	<button type="submit" class="btn btn-primary">Add Actor</button>
		     	<button type="reset" class="btn btn-danger">Clear</button>

		     	<a href="movies">
		     		<button type="button" class="btn btn-warning">Movies</button>
		     	</a>
		     </div>
     </form>
</div>
</body>
</html>