<!--20)Write a PHP program to accept 10 names of students and store those names one below the other in a text file “studentlist.txt” with first line in this text file being “List of Students”.  (15 marks)-->

<!--1)Write a PHP script to accept names of 10 cities through a HTML form and display the cities in alphabetical order. (15 marks)-->

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Form</title>
</head>
<body>
    <form action="" method="GET" name="userinput">
    <!--Note the name here `city[]`-->
        Enter Student #1 Name: <input type="text" name="student[]"><br>
        Enter Student #2 Name: <input type="text" name="student[]"><br>
        Enter Student #3 Name: <input type="text" name="student[]"><br>
        Enter Student #4 Name: <input type="text" name="student[]"><br>
        Enter Student #5 Name: <input type="text" name="student[]"><br>
        Enter Student #6 Name: <input type="text" name="student[]"><br>
        Enter Student #7 Name: <input type="text" name="student[]"><br>
        Enter Student #8 Name: <input type="text" name="student[]"><br>
        Enter Student #9 Name: <input type="text" name="student[]"><br>
        Enter Student #10 Name: <input type="text" name="student[]"><br>
    <input type="Submit"> 
    </form>
    
</body>
</html>

<?php
// used to supress warning messages
error_reporting(E_ERROR | E_PARSE);  

echo "<h2> Writing Student Names to File Students.txt </h2>";
$student_names = $_GET['student'];
print_r($student_names);

//open file in write mode 
$fp = fopen('Students.txt', 'w');  

//Write the heading and feed newline.
fwrite($fp, 'List of Students');
fwrite($fp, "\n"); 

for ($i=0; $i<count($student_names); $i++){
    echo "".$student_names;
    fwrite($fp, $student_names[$i]);  
    fwrite($fp, "\n"); 
}

fclose($fp);      
echo "<h2>File written successfully </h2>";  
?>
