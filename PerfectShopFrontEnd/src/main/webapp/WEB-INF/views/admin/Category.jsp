<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
h1.well {
	color: #jd82;
	align-center;
	
}
.h11
{width: 420px;
box-shadow: 6px 6px 5px darkgray, 0 0 8px red,0 0 5px lightgray;
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
	right: 0;
	bottom: 10;
	left: 0;
	width: 420px;
    height: 380px;
    box-shadow: 6px 6px 5px darkgray, 0 0 8px red,0 0 5px lightgray;
}
</style>
</head>
<body>
<div class="container-fluid">
		<div class="row">
			<div class="col col-md-10">
				<div class="h11"> 	
				<h2 class="well">
					<center>Manage Category</center>
				</h2>
				</div>
				<div class="form_bg" id="CreateCategory">
					<form action="manage_category_add">
						<div class="row">
							
								<label>Category ID</label> <input 
								type="text" name="id"
									placeholder="Enter ID Here.." class="form-control"><br>
							
							
								<label>Category Name</label> <input type="text" name="name"
									placeholder="Enter  Name Here.." class="form-control"><br>
									
									<label> Category Description</label> <input type="text" name="description"
									placeholder="Enter  Description Here.." class="form-control"></br><br>
									<div class="row">
							<center>
								<button type="submit" class="btn btn-danger" name="btnSubmit">Create Category</button>
							</center>
						</div>
							
						</div>
						<br>
						<br>
						</form>
						</div>
						</div>
				</div></div>

<h2> Update Category</h2>
<div>
<form action="manage_category_update">
<table>
<tr>
<td> <input type="text" name="id" value="${selectedCategory.id}"></td>
<td> <input type="text" name="name" value="${selectedCategory.name}"></td>
<td> <input type="text" name="discription" value="${selectedCategory.discription}"></td>
<td><input type="submit" value="Update Category"></td>
</table>
</form>
</div>
<h2>  Delete & Update  the Category</h2>
<div id="Showcategories">
<table border="2">
<thead>
<tr>
<td> Category ID</td>
<td> Category Name</td>
<td> Category Description</td>
</tr>
</thead>

<c:forEach var="category" items="${categoryList}">
<tr>
<td> ${category.id}</td>
<td> ${category.name}</td>
<td> ${category.discription}</td>
<td> <a href="manage_category_delete/${category.id}">Delete</a></td>
<td> <a href="manage_category_edit/${category.id}">Edit</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>