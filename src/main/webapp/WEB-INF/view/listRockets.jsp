<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" />
<c:url value="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript" src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>List Rockets</title>
</head>
<body>
<div class="container mt-5">
     <div class="card">
         <div class="card-header">
             <h3 class="card-title">List Rockets</h3>
         </div>
         <div class="card-body">
            <table class="table table-striped-columns">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Low Orbit Payload</th>
                    <th>High Orbit Payload</th>
                    <th>Launch Date</th>
                    <th>Number of launches</th>
                    <th>Fails</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
    <c:forEach items="${rockets}" var="rocket">
                <tr>
                    <td>${rocket.idRocket}</td>
                    <td>${rocket.name}</td>
                    <td>${rocket.lowOrbitPayload}</td>
                    <td>${rocket.highOrbitPayload}</td>
                    <td><fmt:formatDate dateStyle="dd/MM/yyyy" value="${rocket.lunchDate}" pattern="dd/MM/yyyy"/></td>
                    <td>${rocket.nbLaunches}</td>
                    <td>${rocket.fails}</td>
                    <td><a onclick="return confirm('Do you really want to delete this item ?')" href="deleteRocket?id=${rocket.idRocket}">Delete</a></td>
                    <td><a href="updateRocket?id=${rocket.idRocket}">Update</a></td>
                </tr>
    </c:forEach>
            </table>
            </div>
     </div>
</div>
</body>
</html>