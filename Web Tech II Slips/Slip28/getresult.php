<!-- Write AJAX program to search for category of items from the masteritemlist table from the database named hb. Display the name of the item, and its price -->

<html>
<head>
<style>
table {
  width: 100%;
  border-collapse: collapse;
}

table, td, th {
  border: 1px solid black;
  padding: 5px;
}

th {text-align: left;}
</style>
</head>
<body>

<?php
$q = intval($_GET['q']);
//for assigning categories as below, switch case is a better option!!
if($q == '1'){$qi = 'BREADS';} else {$qi = 'CAKES';}

$con = mysqli_connect('localhost','root','','hb');
if (!$con) {
  die('Could not connect: ' . mysqli_error($con));
}

mysqli_select_db($con,"hb");
//category is a column in the database table masteritemlist in the database named hb
$sql="SELECT * FROM masteritemlist WHERE category = '".$qi."'";
$result = mysqli_query($con,$sql);

echo "<table width='100px'>
<tr>
<th>Item Name</th>
<th>Price</th>
</tr>";
while($row = mysqli_fetch_array($result,MYSQLI_ASSOC)) {
  echo "<tr>";
  echo "<td>" . $row['item_name'] . "</td>";
  echo "<td>" . $row['price'] . "</td>";
  echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>