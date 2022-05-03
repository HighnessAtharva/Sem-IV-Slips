<!-- Write a PHP program to create a sign-up form for the user that accepts user_name, login_id, user_pwd and stores it in “users” table. Use PDO for this program.   -->


<?php
$myhost = "localhost";
$myuser = "root";
$mypwd = "";
$mydb = "students";
echo "<h3>Signup form</h3>";

    $uname = $_POST['uname'];
    $uid = $_POST['uid'];
    $upass = $_POST['upass'];
    try {
        $pdo = new PDO("mysql:host=$myhost;dbname=$mydb", $myuser, $mypwd);
        echo "Successfully connected!!<br>";
    } catch (Exception $e) {
        echo "oops sorry" . $e->getMessage();
    }

    $sql = "INSERT INTO users (user_name, login_id, user_pwd) VALUES (?,?,?)";
    $stmt = $pdo->prepare($sql);
    if ($stmt->execute([$uname, $uid, $upass])) {
        echo "Successfully Signed Up!!<br>";
    } else {
        echo "oops sorry" . $e->getMessage();
    }

?>

<html><body>
<form action="" method="post">
<input type="text" name="uname" placeholder="Enter User Name"><br>
<input type="number" name="uid" placeholder="Enter Login ID"><br>
<input type="password" name="upass" placeholder="Enter Password"><br>
<input type="submit" value="Submit">
</form>
</body>
</html>