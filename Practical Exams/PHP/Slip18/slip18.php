<!-- 18)Write a PHP script to accept name, phone and email address from a HTML form and store this data in a table called “customers” in “orders” database. Assume that “customers” table has only name, phone and email address fields. (25 marks) -->

<?php

if (isset($_POST['submit'])) {
    $host = 'localhost';
    $user = 'root';
    $pass = '';
    $dbname = 'orders';
    $conn = mysqli_connect($host, $user, $pass, $dbname);
    if (!$conn) {
        die('Could not connect: ' . mysqli_connect_error());
    } else {
        echo 'Connected successfully<br/>';
    }
    $username = $_POST['uname'];
    $userphone = $_POST['uphone'];
    $useremail = $_POST['uemail'];

    $sql = "INSERT INTO customers (name, phone, email) VALUES ('$username','$userphone','$useremail')";
    if (mysqli_query($conn, $sql)) {
        echo "Record inserted successfully";
    } else {
        echo "Could not insert record: " . mysqli_error($conn);
    }

    mysqli_close($conn);
}
?>

<html>
<body>
    <form action=<?php echo $_SERVER['PHP_SELF']?> method=post>
        Enter name:<input type=text  name=uname required><br>
        Enter email: <input type=email name=uemail required><br>
        Enter phone: <input type=number name=uphone required><br>
        <input type=submit name=submit>
    </form>
</body>
</html>