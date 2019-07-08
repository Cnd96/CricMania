<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container" style="margin-top: 50px">
		<h3 style="color:blue">Test Player Rankings</h3>
		<table class="table table-dark" style="margin-top: 40px">
			<thead>
		     <tr>
		       <th >Rank</th>
		       <th>Player</th>
		       <th >Country</th>
		       <th >Points</th>
		     </tr>
		    </thead>
	   		 <tbody>
			      <c:forEach items="${players}" var="player"  varStatus="status">
			        <tr>
			          <td>${status.count}</td>
			          <td>${player.name}</td>
			          <td>${player.country}</td>
			          <td>${player.testPoints}</td>
			        </tr>
			      </c:forEach>
			 </tbody>
	    </table>
	</div>

	

</body>
</html>