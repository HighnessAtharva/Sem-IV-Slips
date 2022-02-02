<!--5)Declare a Multidimensional Array. Display specific element from a Multidimensional array. Also delete given element from the Multidimensional array.  (15 marks)-->

<!DOCTYPE html>
<html>
<body>

<?php

// Declaring and Initializing Array
$cars = array (
  array("Volvo","$10000",18),
  array("BMW","$690000",13),
  array("Saab","$540000",2),
  array("Land Rover","$980000",15)
);
    
// Printing The Entire Array
echo "<h2> All Elements of Multidimensional Array </h2>";
for ($row = 0; $row < count($cars); $row++) {
  echo "<p><b>Row number $row</b></p>";

  for ($col = 0; $col < count($cars[0]); $col++) {
    echo "<li>".$cars[$row][$col]."</li>";
  }
  echo "</ul>";
}


//Specific Indexes
echo "<h2> Specific Elements of Multidimensional Array </h2>";
echo $cars[0][0].": Price: ".$cars[0][1].", sold: ".$cars[0][2].".<br>";
echo $cars[2][0].": Price: ".$cars[2][1].", sold: ".$cars[2][2].".<br>";



//Deleting Indexes
echo "<h2>After Deleting Volvo and Saab Multidimensional Array is</h2>";
unset($cars[0]);
unset($cars[2]);
$cars = array_values($cars);
for ($row = 0; $row <count($cars); $row++) {
  echo "<p><b>Row number $row</b></p>";
  for ($col = 0; $col <count($cars[0]); $col++) {
    echo "<li>".$cars[$row][$col]."</li>";
  }
  echo "</ul>";
}
?>

</body>
</html>
