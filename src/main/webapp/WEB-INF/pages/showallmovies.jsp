<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>All the movies List</title>
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
		<b style="margin-left: 80px;">Movies List</b>
	</header>

	<div class="container">
		<img alt="" src="/images/movies.jpeg" style="height: 150px">

		<hr />
		<span id="message"
			style="color: red; font-size: 16px; font-weight: bold;"> <marquee
				scrolldelay="100" direction="right" >List of Movies</marquee>
		</span>
		<hr/>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Mid</th>
					<th>Name</th>
					<th>Year</th>
					<th>Director</th>
					<th>Poster</th>
					<th>Story</th>
					<th colspan=2>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${movieDTOs}" var="item">
			<tr>
<%-- 				<td>${item.mid}</td> --%>
				 <td>${item.mid}
        			<a href="addActor?mid=${item.mid}"><button type="button" class="btn btn-primary" style="height:30px">Add Actor</button></a>
          			<a href="actors?mid=${item.mid}"><button type="button" class="btn btn-info" style="height:30px">Actors</button></a>
       			 </td>
				<td>${item.name}</td>
				<td>${item.year}</td>
				<td>${item.director}</td>
				<td>
					<img src="${item.poster}" style="height:100px;"/>
				</td>
				<td>${item.story}</td>
				<td>
					<a href="deleteMovie?del=${item.mid}">
					<img src="/images/delete.png" style="height:30px"/>
					</a>
				</td>
								<td>
					<a href="editMovie?mid=${item.mid}">
					<img src="/images/edit.png" style="height:30px"/>
					</a>
				</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>