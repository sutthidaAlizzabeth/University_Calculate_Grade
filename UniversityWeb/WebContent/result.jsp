<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>::Calculate Grade</title>
<!-- bootstrap -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<!-- ./bootstrap -->
<link href="Asset/Style.css" rel="stylesheet">
</head>

<body>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
	<!-- ./jQuery (necessary for Bootstrap's JavaScript plugins) -->

	<div class="container">
		<div id="main-topic">
			<center>
				<h1>Calculate Grade</h1>
			</center>
			<!-- profile of student form-->
		</div>
		<h3>Profile</h3>
			<form class="form-horizontal" action="CalculateGrade" method="post">
  				<div class="form-group">
  					<label for="id" class="col-sm-2 control-label">ID</label>
    				<div class="col-sm-6">
      					<input type="text" class="form-control" id="id" name="studentId" value="${studentId}" readonly="readonly">
    				</div>
    				<label for="year" class="col-sm-1 control-label">Year</label>
    				<div class="col-sm-3">
      					<input type="text" class="form-control" id="year" name="year" value="${year}" readonly="readonly">
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="fname" class="col-sm-2 control-label">First Name</label>
    				<div class="col-sm-4">
      					<input type="text" class="form-control" name="fname" id="fname" value="${fname}" readonly="readonly">
    				</div>
    				<label for="lname" class="col-sm-2 control-label">Last Name</label>
    				<div class="col-sm-4">
      					<input type="text" class="form-control" name="lname" id="lname" value="${lname}" readonly="readonly">
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="department" class="col-sm-2 control-label">Department</label>
    				<div class="col-sm-4">
      					<input type="text" class="form-control" name="department" id="department" value="${department}" readonly="readonly">
    				</div>
    				<label for="university" class="col-sm-2 control-label">University</label>
    				<div class="col-sm-4">
      					<input type="text" class="form-control" id="university" value="KMUTT" placeholder="University" readonly="readonly">
    				</div>
  				</div>
  				<br/>
  		<!-- ./profile of student form-->
	</div>
</body>
</html>