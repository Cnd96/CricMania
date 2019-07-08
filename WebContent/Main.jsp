<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/bootstrap.min.js"></script>
<title>CricMania</title>
</head>
<body>
	<div class="container" style="margin-top: 50px">
		<h2 style="color:blue">Cricket Mania</h2>
		<div class="form-group row" style="margin-top: 50px">
			    <div class="col-sm-2">
			      <form action="TestRanks" method="get"  >
					<input class="btn btn-warning" type="submit" value="Test Ranks">
				  </form>
			    </div>
			    <div class="col-sm-2">
			      <form action="OdiRanks" method="get">
				    <input class="btn btn-warning" type="submit" value="Odi Ranks">
				  </form>
			    </div>
			    <div class="col-sm-2">
			      <form action="AddPlayer.jsp" method="get">
					<input class="btn btn-success" type="submit" value="Add Player">
				  </form>
			    </div>
			    <form action="SearchPlayer" method="get">
				    <div class="form-group row">
				      <div class="col-xs-2">
				        <input class="form-control"  name="playerName"type="text" >
				      </div>
				 	  <div class="col-xs-2">
				    	<input class="btn btn-success" type="submit" value="Edit Player">
				      </div>
					</div>
				</form>
		</div>	
		
			
		<table class="table table-dark" style="margin-top: 40px">
		 	<thead>
		     <tr>
		       <th >Rank</th>
		       <th>Player</th>
		       <th >Country</th>
		       <th>Age</th>
		       <th >Batting Style</th>
		       <th >Test Matches</th>
		       <th >Test Runs</th>
		       <th >Test HS</th>
		       <th >Odi Matches</th>
		       <th >Odi Runs</th>
		       <th >Odi HS</th>
		     </tr>
		    </thead>
	   		 <tbody>
			      <c:forEach items="${players}" var="player"  varStatus="status">
			        <tr>
			          <td>${status.count}</td>
			          <td>${player.name}</td>
			          <td>${player.country}</td>
			          <td>${player.age}</td>
			          <td>${player.battingStyle}</td>
			          <td>${player.testMatches}</td>
			          <td>${player.testruns}</td>
			          <td>${player.testHighestScore}</td>
			          <td>${player.odiMatches}</td>
			          <td>${player.odiruns}</td>
			          <td>${player.odiHighestScore}</td>               
			        </tr>
			      </c:forEach>
			 </tbody>
	    </table>	
	</div>
</body>
</html>