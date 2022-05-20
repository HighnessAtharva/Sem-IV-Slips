<!-- Write a PHP program that uses PDO to get connected with a database called “students” and selects data from the table “SYBCA” to display rollno, student_name in a table that has borders around it. -->
<?php
$myhost = "localhost";
$myuser = "root";
$mypwd = "";
$mydb = "students";
echo "<h3>PDO - Students DB (SYBCA TABLE)</h3>";
try{
	$pdo = new PDO("mysql:host=$myhost;dbname=$mydb",$myuser,$mypwd);
	echo "Successfully connected!!<br>";
} catch(Exception $e){
	echo "oops sorry".$e->getMessage();
}

$sql = $pdo->query("SELECT * FROM SYBCA");
$result = $sql->fetchAll(PDO::FETCH_ASSOC);
$pdo = null;
echo "<table border=1>";
foreach($result as $student){
	echo "<tr>
<td>".$student['rollno']."</td> 
	<td>".$student['student_name']."</td>
	</tr>";
}
echo "</table>";
?>