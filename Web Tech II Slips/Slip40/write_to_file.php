<!-- Write a PHP program to accept how many number of values from the user first and then accept those values from the user. Store this data in a .txt file called “mydata.txt”. Reopen this file, read all the values and find average, minimum and maximum of these values -->
<?php
$arraynums=$_POST['nums']; 
echo ("Writing to file mydata.txt <br>");
file_put_contents('mydata.txt', print_r($arraynums, TRUE));


echo ("Reading from file mydata.txt<br><br>");
$readnums=file_get_contents('mydata.txt');
echo $readnums;
echo ("Calculating...");
$minimum=min($arraynums);
$maximum=max($arraynums);
$average=array_sum($arraynums)/count($arraynums);
echo ("<br>Minimum: $minimum<br>Maximum: $maximum<br>Average: $average");

?>