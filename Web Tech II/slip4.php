<!--4)Write a menu driven program to perform the following operations on an associative array:
a.Reverse the order of each element’s key-value pair [Hint: use array_flip()]
b.Traverse the elements in an array in random order [[Hint: use shuffle()].(15 marks)-->

<?php

//Initializing Associative Array
$ages = array(
    "Atharva"=>"19",
    "Peter"=>"35", 
    "Ben"=>"37", 
    "Joe"=>"43",
    "Sersi"=>"5000",
    "Yoda"=>"100000");
    echo "<b>Initially, the associative array is: </b><br>";
    foreach($ages as $name => $age) {
        
        echo "" . $name . " is " . $age." years old.";
        echo "<br>";
        
      }
    echo "<hr>";

//Reverse Order of Key-Value Pair
$ages=array_flip($ages);
echo "<b>After Flipping, the associative array is: </b><br>";
    foreach($ages as $name => $age) {
        
        echo  "Key: ". $name . " Value: " . $age."";
        echo "<br>";
        
      }
    echo "<hr>";


//Shuffle the array and traverse the randomized array
//Note: Calling the shuffle function randomizes the array but in doing so removes the keys. 
$ages=shuffle($ages);
echo "<b>After Shuffling, the associative array is: </b><br>";
foreach($ages as $name => $age) {
        
    echo  "Key: ". $name . " Value: " . $age."";
    echo "<br>";
    
  }
echo "<hr>";

?>