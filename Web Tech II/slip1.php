<!--1)Write a PHP script to accept names of 10 cities through a HTML form and display the cities in alphabetical order. (15 marks)-->

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Form</title>
</head>
<body>
    <form action="" method="GET" name="userinput">
    <!--Note the name here `city[]`-->
        Enter City #1: <input type="text" name="city[]"><br>
        Enter City #2: <input type="text" name="city[]"><br>
        Enter City #3: <input type="text" name="city[]"><br>
        Enter City #4: <input type="text" name="city[]"><br>
        Enter City #5: <input type="text" name="city[]"><br>
        Enter City #6: <input type="text" name="city[]"><br>
        Enter City #7: <input type="text" name="city[]"><br>
        Enter City #8: <input type="text" name="city[]"><br>
        Enter City #9: <input type="text" name="city[]"><br>
        Enter City #10: <input type="text" name="city[]"><br>
    <input type="Submit"> 
    </form>
    
</body>
</html>

<?php
// used to supress warning messages
error_reporting(E_ERROR | E_PARSE);


echo "<h2> Cities Sorted Alphabetically are </h2>";
$cities = $_GET['city'];
sort($cities);
foreach($cities as $city){
   echo $city . "<br />"; 
}
?>
