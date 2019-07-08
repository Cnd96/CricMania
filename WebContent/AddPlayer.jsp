<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/bootstrap.min.js"></script>
<title>CricMania</title>
</head>
<body>
		<div class="container"  style="margin-top: 50px"> 
		<h2 style="color:blue">Add Player</h2>
	
		<form action="AddPlayer" method="post" style="margin-top: 50px">
			
			<div class="form-group row">
			    <label class="col-sm-2 col-form-label">Name:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control" name="name" placeholder="Name">
			    </div>
			    <label class="col-sm-2 col-form-label">Country :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"  name="country" placeholder="Country">
			    </div>
			 </div>
			 
			 <div class="form-group row">
			    <label class="col-sm-2 col-form-label">Age :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control" name="age" placeholder="Age">
			    </div>
			    <label class="col-sm-2 col-form-label">Batting Style:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"  name="battingStyle" placeholder="Batting Style">
			    </div>
			 </div>
			 
			<div class="form-group row">
			    <label class="col-sm-2 col-form-label">Test Matches :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"  name="testMatches" placeholder="Test Matches">
			    </div>
			    <label class="col-sm-2 col-form-label">Odi Matches :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"  name="odiMatches" placeholder="Odi Matches">
			    </div>
			 </div>
			 <div class="form-group row">
			    <label class="col-sm-2 col-form-label">Test Points:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"  name="testPoints" placeholder="Test Points">
			    </div>
			    <label class="col-sm-2 col-form-label">Odi Points :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"   name="odiPoints" placeholder="Odi Points">
			    </div>
			 </div>
			  <div class="form-group row">
			    <label class="col-sm-2 col-form-label">Test Runs:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"  name="testruns" placeholder="Test Runs">
			    </div>
			    <label class="col-sm-2 col-form-label">Odi Runs :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"   name="odiruns" placeholder="Odi Runs">
			    </div>
			 </div>
			 <div class="form-group row">
			    <label class="col-sm-2 col-form-label">Test Highest Score:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control" name="testHighestScore" placeholder="Test Highest Score">
			    </div>
			    <label class="col-sm-2 col-form-label">Odi Highest Score:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"   name="odiHighestScore" placeholder="Odi Highest Score">
			    </div>
			 </div>
					
		
			<input  class="btn btn-primary"  type="submit" value="Save">
		</form>
	</div>
</body>
</html>