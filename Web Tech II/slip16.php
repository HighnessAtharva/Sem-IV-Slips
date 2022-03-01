
<?php

$aname = $_GET['aname'];


$servername = "localhost";
$username = "root";
$password = "narnia123";
$dbname = "slip16";
$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error){
    die("Connection failed: ".$conn->connect_error);
  }
  echo("Connected successfully to database <b>" . $dbname. "</b>");
  

$sql = "select mname from MOVIE, ACTOR where aname = '$aname' and MOVIE.ano=ACTOR.ano;";
$result = $conn->query($sql);

echo "<table border=1>";
echo "<tr><th>Movie No</th></tr>";

while($row   =   $result->fetch_assoc()){
    echo "<tr>";
    echo "<td>".$row['mname']."</td>";
    echo "</tr>";
}
echo "</table>";
?>