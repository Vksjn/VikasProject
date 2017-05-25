<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<style>
h1.well{
color : black;
align-center;

box-shadow: 5px 5px 5px darkgray, 0 0 5px red,0 0 5px lightgray;
}
.form_bg {
    background-color:#eee;
    color:#666;
    padding:20px;
    border-radius:10px;
    position: relative;
    border:1px solid #fff;
    margin:80 auto;
    top: 30;
    right: 10;
    bottom: 10;
    left: 20;
   	
    box-shadow: 6px 6px 5px darkgray, 0 0 8px red,0 0 5px lightgray;
}
</style>
<script type="text/javascript">
    $(function () {
        $("#btnSubmit").click(function () {
            var password = $("#txtPassword").val();
            var confirmPassword = $("#txtConfirmPassword").val();
            if (password != confirmPassword) {
                alert("Passwords do not match.");
                return false;
            }
            return true;
        });
    });
</script>

  </head>
<body>
<div class="container-fluid">
<div class="row">
<div class="col col-lg-10">

<h1 class="well"><center>Create Account</center></h1>
   <div class="form_bg">
    <form  class="form-inline" action="RegistrationForm" method="GET">
  <div class="row">
    <div class="col-sm-6 form-group">
	<label>First Name</label>
	<input type="text" name="FirstName" placeholder="Enter First Name Here.." class="form-control">
							</div>			
    <div class="col-sm-6 form-group">
	<label>Last Name</label>
	<input type="text" name= "LastName"placeholder="Enter Last Name Here.." class="form-control">
							</div></div>
	<br><br>
	<div class="row">
		<div class="form-group">
	<label>Address</label>
	<textarea class="form-control" name= "Address" placeholder="Enter Address Here.." rows="3" cols="100" class="form-control"></textarea>
						</div></div>
	<br><br><div class="row">
	<div class="col-sm-4 form-group">
	<label>City</label>
	<input type="text" name= "City" placeholder="Enter City Name Here.." class="form-control">
	</div>	
	<div class="col-sm-4 form-group">
	<label>State</label>
	<input type="text" name= "State" placeholder="Enter State Name Here.." class="form-control">
	</div>	
	<div class="col-sm-4 form-group">
	<label>Zip</label>
	<input type="text" name= "Zip" placeholder="Enter Zip Code Here.." class="form-control">
	</div>		
	</div><br><br>
	<div class="row">
							<div class="col-sm-6 form-group">
								<label>Password</label>
								<input type="password" name= "Password" placeholder="Enter Password Here" class="form-control" id="txtPassword">
							</div>		
							<div class="col-sm-6 form-group">
								<label>Re-Password</label>
								
								<input type="password" name= "Repassword" placeholder="Enter Re-Password Here.." class="form-control" id="txtConfirmPassword">
							</div>	
						</div>			<br><br>
						
							
						
						<div class="row">
						<div class="col-sm-6 form-group">
						<label>Phone Number</label>
						<input type="text" name= "Phone" placeholder="Enter Phone Number Here.." class="form-control">
						</div>	
					
					<div class="col-sm-6 form-group">
						<label>Email Address</label>
						<input type="email" name= "Email" placeholder="Enter Email Address Here.." class="form-control">
					</div>
					<br>
					<br><br><div class="row">
						<div class="col-sm-4 form-group">
						<label>Role</label>
						</div>
						<div class="col-sm-4 form-group">
						<label><input type="radio" name="role" id="role" value="admin"  class="form-control">Admin
							</label></div>
					
					<div class="col-sm-4 form-group">
						<label>
						<input type="radio" name="role" id="role" value="user"   class="form-control">User</label>
					</div></div>
					<br><br><div class="row">
        			 <center><button type="submit" class="btn btn-danger" name ="btnSubmit">Submit</button></center>
                    </div>
  </form>
</div>
</div>
</div>
</div>
</body>
</html>
