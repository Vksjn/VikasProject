<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
 <!-- <link rel="stylesheet" href="src/main/webapp/WEB-INF/resources/css/bootstrap.css" type="css/text" href="Color.css"> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/scripts/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script src="content/js/jquery.min.js"></script>
<script src="content/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="http://malsup.github.io/min/jquery.cycle2.js.map"></script>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
    $(document).ready(function () {
        $('.dropdown-toggle').dropdown();
    });
</script>
 
</head>
<body class="container-fluid">
<jsp:include page="slider.jsp"></jsp:include>
${RegistrationSave}
<div class="div1">
<center><h1>
 <mark>Welcome to </mark><code>Shopping Cart</code></h1></center>
<ul class="nav navbar-nav navbar-right">

<!-- <a href="Login">Login</a>



<a href="Registration">Registration</a> -->
</ul>


<br>


<jsp:include page="Menu.jsp"></jsp:include>



<%-- <jsp:include page="Menu.jsp"></jsp:include> --%>

<c:if test="${isUserClickLogin=='true'}">

<jsp:include page="Login.jsp"></jsp:include>
</c:if>
<c:if test="${isUserClickRegistration=='true'}">
<jsp:include page="Registration.jsp"></jsp:include>
</c:if>


<c:if test="${isAdmin=='true'}">
<jsp:include page="admin/AdminHome.jsp"></jsp:include>
</c:if>
<c:if test="${isAdminClickedCategories=='true'}">
<jsp:include page="admin/Category.jsp"></jsp:include><br>
</c:if>
<c:if test="${isAdminClickedSuppliers=='true'}">
<jsp:include page="admin/Supplier.jsp"></jsp:include><br>
</c:if>
<c:if test="${isAdminClickedProducts=='true'}">
<jsp:include page="admin/Product.jsp"></jsp:include>
</c:if>
</div>
</body>
</html>