<!DOCTYPE html>
<html>
<head><title>LOGIN SYSTEM</title>
<style>
.myheader {
	color: blue;
}
</style>
</head>
<body>
<center><h1 class="myheader">LOGIN</h1><br><br>
	<form action="" method="post">
		<input type="text" name="uname" placeholder="Enter Username"><br><br>
		<input type="password" name="upwd" placeholder="Enter Password"><br><br>
		<input type="submit" name="submit" value="Login">&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" name="reset" value="Clear Form">
	</form>
</center>
</body>
</html>

<?php
if(isset($_POST["submit"])){
	/* $uname = $_POST["uname"];
	$upwd = $_POST["upwd"];
	$uname = strip_tags($uname);
	$upwd = strip_tags($upwd); */
	$uname = strip_tags($_POST["uname"]);
	$upwd = strip_tags($_POST["upwd"]);
	if($uname == "Admin" && $upwd == "Abcd1234"){
		echo $uname."     ".$upwd."<br>";
		echo "Password is CORRECT!";
	} elseif($uname != "Admin" &&  $upwd == "Abcd1234") {
		echo "Username is INCORRECT!";
	}
	else{
		echo "Password is INCORRECT!";
	}
}
?>