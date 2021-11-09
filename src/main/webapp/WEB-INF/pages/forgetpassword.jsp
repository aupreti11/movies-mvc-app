<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Welcome Home</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js">
    </script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<style type="text/css">
.semere {
	display: block;
	margin-left: auto;
	margin-right: auto;
}
</style>

</head>

<header
	style="height: 20px; background-color: powderblue; margin-left: 50px;">

	<b>Get your password.</b>
</header>
<hr />
<body>
	<div class="container">

		<img src="images/reset.jpeg" style="height: 220px;">

		<h6 style="color:blue">${msg}</h6>

		<form action="forgetPassword" method="post">
		
		<table class="table">

    <tbody>
      <tr>
        <td>${logindao.password}</td>
      </tr> 
      </tbody>
      </table>

			<fieldset>
				<label for="username">Username</label> <br /> 
				<input type="text" name="username" class=“form-control” style="width: 50%;"> <br />
				<br />
				<button type="submit" class="btn btn-success">Get Password</button>

				 <a href="clogin"><button type="button"
						class="btn btn-primary">Sign in</button></a>
			</fieldset>

		</form>
	</div>
</body>
</html>