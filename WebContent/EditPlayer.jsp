<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title><link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/bootstrap.min.js"></script>
<title>CricMania</title>
</head>
<body>

	<div class="container"  style="margin-top: 50px"> 
		<h2 style="color:blue">Edit Player</h2>
	
		<form action="EditPlayer" method="post">
	   	    <input type="text" value="${player.name}" hidden name="name">
			<h4>Name: ${player.name}</h4>
			<h5>Country: ${player.country}</h5>
			<h5>Batting Style: ${player.battingStyle}</h5>
			
			<div class="form-group row">
			    <label class="col-sm-2 col-form-label">Age :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control" value="${player.age}" name="age" placeholder="Age">
			    </div>
			 </div>
			 
			<div class="form-group row">
			    <label class="col-sm-2 col-form-label">Test Matches :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control" value="${player.testMatches}" name="testMatches" placeholder="Test Matches">
			    </div>
			    <label class="col-sm-2 col-form-label">Odi Matches :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control" value="${player.odiMatches}" name="odiMatches" placeholder="Odi Matches">
			    </div>
			 </div>
			 <div class="form-group row">
			    <label class="col-sm-2 col-form-label">Test Points:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control" value="${player.testPoints}" name="testPoints" placeholder="Test Points">
			    </div>
			    <label class="col-sm-2 col-form-label">Odi Points :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"  value="${player.odiPoints}" name="odiPoints" placeholder="Odi Points">
			    </div>
			 </div>
			  <div class="form-group row">
			    <label class="col-sm-2 col-form-label">Test Runs:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control" value="${player.testruns}" name="testruns" placeholder="Test Runs">
			    </div>
			    <label class="col-sm-2 col-form-label">Odi Runs :</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"  value="${player.odiruns}" name="odiruns" placeholder="Odi Runs">
			    </div>
			 </div>
			 <div class="form-group row">
			    <label class="col-sm-2 col-form-label">Test Highest Score:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control" value="${player.testHighestScore}" name="testHighestScore" placeholder="Test Highest Score">
			    </div>
			    <label class="col-sm-2 col-form-label">Odi Highest Score:</label>
			    <div class="col-sm-4">
			      <input type="text" class="form-control"  value="${player.odiHighestScore}" name="odiHighestScore" placeholder="Odi Highest Score">
			    </div>
			 </div>
					
		
			<input  class="btn btn-primary"  type="submit" value="Save">
		</form>
	</div>
	   
</body>
</html>