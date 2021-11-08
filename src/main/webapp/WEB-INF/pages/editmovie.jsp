<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Movie Info here</title>
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
</head>
<body>

	<header style="height: 25px; background-color: darkorange">
		<b style="margin-left: 80px;">Edit Movie Page</b>
	</header>
	<div class="container">
		<img src="/images/update.png" style="height: 200px" />
		<hr>
		<span id="message"
			style="color: red; font-size: 16px; font-weight: bold;"> <marquee
				scrolldelay="100" direction="right">Update Movie info</marquee>
		</span>
		<hr>
		<form action="updateMovie" method="post">
		<div class="form-group">
			 <input type="hidden" name="mid" value="${movieDTO.mid}">
		</div>
		<div class="form-group">
			<label>Name</label> <input value="${movieDTO.name}" type="text" name="name" class="form-control" style="width: 70%">
		</div>
		<div class="form-group">
			<label>Year</label> <select name="year" class="form-control" style="width: 70%" disabled="disabled">
				<option selected disabled>Select</option>
				<option ${movieDTO.year=='2017'?'selected':''}>2017</option>
				<option ${movieDTO.year=='2018'?'selected':''}>2018</option>
				<option ${movieDTO.year=='2019'?'selected':''}>2019</option>
				<option ${movieDTO.year=='2020'?'selected':''}>2020</option>
				<option ${movieDTO.year=='2021'?'selected':''}>2021</option>
			</select>
		</div>
		<div class="form-group">
			<label>Director</label> <input type="text"
				value="${movieDTO.director}" name="director" class="form-control"
				style="width: 60%">
		</div>
		<div class="form-group">
			<label>Poster</label> <input type="text"
				value="${movieDTO.poster}" name="poster" class="form-control" style="width: 60%">
				<img src="${movieDTO.poster}" style="height:50px"></img> 
		</div>
		<div class="form-group">
			<label>Story</label>
			<textarea name="story" rows="3" class="form-control"
				style="width: 70%">${movieDTO.story}</textarea>
		</div>
		<button type="submit" class="btn btn-primary">Update Movie</button>
		<button type="reset" class="btn btn-warning">Reset</button>
		</form>
	</div>

</body>
</html>