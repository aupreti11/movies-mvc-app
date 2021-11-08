<!DOCTYPE html>
<html lang="en">
<head>
<title>Add Movie</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<body>
	<header style="height: 25px; background-color: darkorange">
		<b style="margin-left: 80px;">Add Movie</b>
	</header>

	<div class="container">
		<img alt="" src="/images/profiles.jpeg" style="height: 120px">

		<hr />
		<span id="message"
			style="color: red; font-size: 16px; font-weight: bold;"> <marquee
				scrolldelay="100" direction="right">Add Movie Here</marquee>
		</span>
		
		<b style="color:#blue">${message}</b> 
		<hr />
	
		<form action="addMovie" method="post">
			<div class="form-group">
				<label>Name</label> <input type="text" name="name"
					class="form-control" style="width: 70%">
			</div>
			<div class="form-group">
				<label>Year</label> <select name="year" class="form-control" style="width: 60%">
					<option disabled selected>Select</option>
					<option>2017</option>
					<option>2018</option>
					<option>2019</option>
					<option>2020</option>
					<option>2021</option>
				</select>
			</div>
			<div class="form-group">
				<label>Director</label> <input type="text" name="director"
					class="form-control" style="width: 70%">
			</div>
			<div class="form-group">
				<label>Poster</label> <input type="text" name="poster"
					class="form-control" style="width: 70%">
			</div>
			<div class="form-group">
				<label>Story</label>
				<textarea name="story" rows="3" class="form-control"
					style="width: 60%"></textarea>
			</div>
		<div class="form-group">	
		<button type="submit" class="btn btn-success">Upload Movie</button>
		<button type="reset" class="btn btn-danger">Clear All</button>
		<a href="movies"><button type="button" class="btn btn-info">Show All Movies</button></a>
		</div>
		</form>

	</div>

</body>
</html>