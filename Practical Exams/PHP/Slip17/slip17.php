<!--
17)Write a PHP script to connect to the database “bmcc_students” and display the message “Database connection successful”. (15 marks)
-->

<?php
$host = "localhost";
$username = "root";
$password = "";
$dbname = "students"; // in exam use the DB bmc_students

// Create connection
$conn = mysqli_connect($host, $username, $password, $dbname);

// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
} else {
    echo ("Connected successfully to database <b>" . $dbname . "</b>");
}

$sql = "SELECT rollno, student_name FROM sybca";
$result = mysqli_query($conn, $sql);

if (mysqli_num_rows($result) > 0) {
    echo "<table><tr><th>ID</th><th>Name</th></tr>";
    while ($row = mysqli_fetch_assoc($result)) {
        echo "<tr><td>" . $row["rollno"] . "</td><td>" . $row["student_name"] . "</td></tr>";
    }
    echo "</table>";
} else {
    echo "0 results";
}

?>