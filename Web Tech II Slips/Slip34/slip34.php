<!-- Write a self processing form using PHP to collect data from the user such as name, address, city, email and phone and after validating it for correct data, stores the data in the table “customers” in a database called “orders”. -->


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
    $useraddress = $_POST['uaddress'];

    $sql = "INSERT INTO customers (name, phone, email, address) VALUES ('$username','$userphone','$useremail','$useraddress')";
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
    <form action="" method="post">
        Enter name:<input type="text"  name="uname" required><br>
        Enter phone: <input type="number" name="uphone" required><br>
        Enter email: <input type="email" name="uemail" required><br>
        Enter address: <input type="text" name="uaddress" required><br>
        <input type="submit" name="submit">
    </form>
</body>
</html>