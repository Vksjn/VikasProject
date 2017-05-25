<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	$(document).ready(function() {
		$('.dropdown-toggle').dropdown();
	});
</script>
<style>
h1.well {
	color: black;
	align-center;
}

.form_bg {
	background-color: #eee;
	color: #666;
	padding: 20px;
	border-radius: 10px;
	position: relative;
	border: 1px solid #fff;
	margin: 80 auto;
	top: 30;
	right: 10;
	bottom: 10;
	left: 20;
}
</style>
</head>


<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col col-lg-10">

				<h2 class="well">
					<center>Manage Product</center>
				</h2>
				<div class="form_bg">
					<form:form class="form-inline" action="manage_Product_add" method="POST" commandName="product" enctype="multipart/form-data">
						<div class="row" id="CreateCategory">
							<div class="col-sm-6 form-group">
								<label>Product ID</label> <input 
								type="text" name="id"
									placeholder="Enter ID Here.." class="form-control">
							</div>
							<div class="col-sm-6 form-group">
								<label> Name</label> <input type="text" name="name"
									placeholder="Enter  Name Here.." class="form-control">
							</div>
						</div>
						<br>
						<br>

						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Description</label> <input type="text" name="discription"
									placeholder="Enter Description Here.." class="form-control">
							</div>
							<div class="col-sm-6 form-group">
								<label>Price</label> <input type="text" name="price"
									placeholder="Enter Price Here.." class="form-control">
							</div>
						</div>
						<br>
						<br>
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Category</label>
								
								<form:select path="category.id">
								   <form:option value="0" label="Select a Category" />
								   <form:options items="${categoryList }" itemValue="id" itemLabel="name"/>
								</form:select>
							</div>
							<div class="col-sm-6 form-group">
								<label>Supplier</label>
								<form:select path="supplier.id">
								   <form:option value="0" label="Select a Supplier" />
								   <form:options items="${supplierList}" itemValue="id" itemLabel="name"/>
								</form:select>
							</div></div>
							 <div class="row">
							<div class="col-sm-6 form-group">
								<label>Product Image</label> <input type="file" name="image"
									class="form-control">
							</div>
						</div> 
						<br>
						<br>
						<div class="row">
							<center>
								<button type="submit" class="btn btn-danger" name="btnSubmit">Submit</button>
							</center>
						</div>
						
					</form:form>
				</div>
			</div>
		</div>
	</div>
<div class="container-fluid">
		<div class="row">
			<div class="col col-lg-10">

				<h2 class="well">
					<center>Show all Product Details</center></h2>
					<div class ="row">
							<div class="col-sm-1 form-group">
								<label>Image</label>
								
							</div>
							<div class="col-sm-1 form-group">
								<label>Product ID</label></div>
								<div class="col-sm-1 form-group">
								<label>Supplier Name</label></div>
								<div class="col-sm-1 form-group">
								<label>Category Name </label></div>
								<div class="col-sm-1 form-group">
								<label>Name </label></div>
								<div class="col-sm-1 form-group">
								<label>Description </label></div>
								<div class="col-sm-1 form-group">
								<label>Price </label></div>
							</div>
							<c:forEach var="product" items="${productList}">
							<div class ="row">
							<div class="col-sm-1 form-group">
								<label><img src="<c:url value='/resources/product/images/${product.id }.png'/> " height="60" width="60"></label>
								
							</div>
							<div class="col-sm-1 form-group">
								<label>${product.id}</label></div>
								<div class="col-sm-1 form-group">
								<label>${product.
								supplier.name}</label></div>
								<div class="col-sm-1 form-group">
								<label>${product.category.id} </label></div>
								<div class="col-sm-1 form-group">
								<label>${product.name} </label></div>
								<div class="col-sm-1 form-group">
								<label>${product.discription} </label></div>
								<div class="col-sm-1 form-group">
								<label>${product.price} </label></div>
							</div>
				</c:forEach>
				</div>
				</div>
				</div>
</body>
</html>