<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" />
<c:url value="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript" src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Create a Rocket</title>
</head>
<body>
<div class="container mt-5">
     <div class="card-body">
        <form action="saveRocket" method="post">
            <div class="form-group">
                <label class="control-label">Name</label>
                <input type="text" name="name" class="form-control" id="name"/>
            </div>
            <div class="form-group">
                <label class="control-label">high Orbit payload:</label>
                <input type="text" name="highOrbitPayload" class="form-control" />
            </div>
            <div class="form-group">
                <label class="control-label">low Orbit payload:</label>
                <input type="text" name="lowOrbitPayload" class="form-control" />
            </div>
            <div class="form-group">
                <label class="control-label">launch date:</label>
                <input type="date" name="lunchDate" class="form-control" />
            </div>
            <div class="form-group">
                <label class="control-label">launch number:</label>
                <input type="text" name="nbLaunches" class="form-control" />
            </div>
            <div class="form-group">
                <label class="control-label">fails:</label>
                <input type="text" name="fails" class="form-control" />
            </div>

            <div>
                <button type="submit" class="btn btn-primary">Add</button>
            </div>
        </form>
    </div>
${message}
<br/>
<br/>
<a href="ListRockets">Liste des rockets</a>
</div>
</body>
</html>
