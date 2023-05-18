<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
    <meta charset="windows-1256">
    <title>Update Rocket</title>
</head>
<body>
<div class="container mt-5">
    <div class="card-body">
<form action="updateRocket" method="post">
    <div class="form-group">
        <label class="form-label">Rocket ID</label>
        <input type="text" class="form-control" name="idRocket" value="${rocket.idRocket}" readonly>
    </div>
    <div class="form-group">
        <label class="form-label">Rocket Name</label>
        <input type="text" class="form-control" name="name" value="${rocket.name}">
    </div>
    <div class="form-group">
        <label class="form-label">Low Orbit Payload</label>
        <input type="text" class="form-control" name="lowOrbitPayload" value="${rocket.lowOrbitPayload}">
    </div>
    <div class="form-group">
        <label class="form-label">High Orbit Payload</label>
        <input type="text" class="form-control" name="highOrbitPayload" value="${rocket.highOrbitPayload}">
    </div>
    <div class="form-group">
        <label class="form-label">Lunch Date</label>
        <fmt:formatDate pattern="dd/MM/yyyy" value="${rocket.lunchDate}" var="formatDate"/>
        <input type="date" class="form-control" name="date" value="${formatDate}">
    </div>
    <div class="form-group">
        <label class="form-label">Number of Launches</label>
        <input type="text" class="form-control" name="numberOfLaunches" value="${rocket.nbLaunches}">
    </div>
    <div class="form-group">
        <label class="form-label">Fails</label>
        <input type="text" class="form-control" name="fails" value="${rocket.fails}">
    </div>
    <div>
        <button type="submit" class="btn btn-primary">Update</button>
    </div>
</form>
    </div>
<br/>
<br/>
<a href="listRockets.jsp">Back to list</a>
</div>
</body>
</html>