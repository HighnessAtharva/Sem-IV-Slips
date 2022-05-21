<!--
17)Write a PHP script to connect to the database “bmcc_students” and display the message “Database connection successful”. (15 marks)
-->

<?php
$servername = "localhost";
$username = "root";
$password = "narnia123";
$dbname = "bmcc_students";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo ("Connected successfully to database <b>" . $dbname . "</b>");

$sql = "SELECT studentID, studentName FROM studentData";
$result = $conn->query($sql);

if ($result->num_rows > 0) {

    echo "<table><tr><th>ID</th><th>Name</th></tr>";
    // output data of each row

    while ($row = $result->fetch_assoc()) {
        echo "<tr><td>" . $row["studentID"] . "</td><td>" . $row["studentName"] . "</td></tr>";
    }
    echo "</table>";
} else {
    echo "0 results";
}

$conn->close();
?>