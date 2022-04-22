<!--
6)Write a PHP script to sort the following associative array : array("Rahul"=>"31","Jui"=>"41","veena"=>"39","Rijul"=>"40")  in 
a.ascending order sort by value 
b.ascending order sort by Key
c.descending order sorting by Value
d.descending order sorting by Key (25 marks)


<comment>
sort() - sort arrays in ascending order
rsort() - sort arrays in descending order
asort() - sort associative arrays in ascending order, according to the value
ksort() - sort associative arrays in ascending order, according to the key
arsort() - sort associative arrays in descending order, according to the value
krsort() - sort associative arrays in descending order, according to the key
</comment>
-->
<?php
//Initialize Array
$example=array("Rahul"=>"31","Jui"=>"41","veena"=>"39","Rijul"=>"40");
echo "<b>Initially, array is: </b><br>";
print_r($example);
echo "<hr>";

//ascending order sort by value 
asort($example);
echo "<b>Sorting Ascending Order of Value, array is: </b><br>";
print_r($example);
echo "<hr>";

//ascending order sort by Key
ksort($example);
echo "<b>Sorting Ascending Order of Key, array is: </b><br>";
print_r($example);
echo "<hr>";

//descending order sorting by Value
arsort($example);
echo "<b>Sorting Descending Order of Value, array is: </b><br>";
print_r($example);
echo "<hr>";

//descending order sorting by Key
krsort($example);
echo "<b>Sorting Descending Order of Key, array is:</b><br>";
print_r($example);
echo "<hr>";

?>
