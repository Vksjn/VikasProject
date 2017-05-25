
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <style>
  .dropdown:hover .dropdown-menu {
    display: block;
    margin-top: 0;
    
    
} 
 }
 .affix {
      top: 0;
      width: 100%;
      }
 .big{ 
      color: white;
      margin-top: 17px;
     }     
 
  </style>
  </head>
<body data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
	            </div>
    <div class="collapse navbar-collapse" id="myNavbar">

      <ul class="nav navbar-nav">
        <li class="active"><a href="Home">Home</a></li>
        <c:forEach var="category" items="${categoryList}">
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">${category.name} <span class="caret"></span></a>
          <c:forEach var="product" items="${productlistByCategory}">
          <ul class="dropdown-menu">
            <li><a href="#">${product.name}</a></li>
            
          </ul>
          </c:forEach>
        </li>
        </c:forEach>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Home Appliances <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Dry Iron</a></li>
            <li><a href="#">Sewing Machine</a></li>
            <li><a href="#">Security Systems</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Men <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">T-shirt</a></li>
            <li><a href="#">Jeans</a></li>
            <li><a href="#">Shirt</a></li>
          </ul>
        </li>
      </ul>
      
      <ul class="nav navbar-nav navbar-right">
      <c:if test="${empty message }">
        <li><a href="Registration"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        
        <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </c:if>
        <c:if test="${not empty message }">
        <li><a href="logout"><span class="glyphicon glyphicon-off"></span> Logout</a></li>
        </c:if>
        <li class="big">${message}</li>
      </ul>
    </div>
  </div>
</nav>
  


</body>
</html>

