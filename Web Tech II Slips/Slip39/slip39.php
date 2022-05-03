<!-- Write a PHP program to create session variable myname after fetching the valid data from the “users” table for user Admin and password “abcd1234”. -->

<?php
if (isset($_POST["submit"])) {
    $hostname = "localhost";
    $username = "root";
    $password = "";
    $dbname = "bca_programs";
    $conn = mysqli_connect($hostname, $username, $password, $dbname);
    $uname = strip_tags($_POST["uname"]);
    $upwd = strip_tags($_POST["upwd"]);
    if ($conn) {
        $sql = "SELECT * FROM users WHERE username='$uname' AND password='$upwd'";
        if ($result=mysqli_query($conn, $sql)){
            if(mysqli_num_rows($result) > 0) {
            session_start();
            $_SESSION["myname"] = $uname;
            echo "Session Variable Set. Welcome " . $_SESSION["myname"];
        }
    } else {
            echo "Invalid Username or Password!";
        } 
    }
    else{
        die("Connection Failed: " . mysqli_connect_error());
    
}
}
?>


<html>
<body>
<h1>Setting Session</h1><br><br>
	<form action="" method="post">
		<input type="text" name="uname" placeholder="Enter Username"><br><br>
		<input type="password" name="upwd" placeholder="Enter Password"><br><br>
		<input type="submit" name="submit" value="Login">
	</form>
</body>
</html>

