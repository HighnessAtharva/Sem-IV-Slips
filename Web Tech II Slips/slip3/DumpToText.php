<?php
echo ("
<html>
<title>Result Form</title>
<style>
table, th, td {
    border: solid 1px #000000;
    border-width:2px;
    text-align:center;
    padding: 15px;
    border-collapse:collapse;
    }
</style>
");
if ($_POST){
    echo "<center>";
    echo "<h4> Data Entered is</h4>";

    //function to merge internal and external marks into a single index [2] called as studentTotal
    function process_array($StudentArrayUnprocessed){
        $ProcessedArray=[];
        foreach ($StudentArrayUnprocessed as $studentXYZ){
            
            $studentName=$studentXYZ[0];
            $studentRoll=$studentXYZ[1];
            $studentTotal=$studentXYZ[2]+$studentXYZ[3];
            $ProcessedArrayXYZ=[$studentName,$studentRoll,$studentTotal];
            array_push($ProcessedArray, $ProcessedArrayXYZ);
        }
            return $ProcessedArray;
    }

    //store all the form data into 10 arrays
    $student1 = $_POST['s1'];
    $student2 = $_POST['s2'];
    $student3 = $_POST['s3'];
    $student4 = $_POST['s4'];
    $student5 = $_POST['s5'];
    $student6 = $_POST['s6'];
    $student7 = $_POST['s7'];
    $student8 = $_POST['s8'];
    $student9 = $_POST['s9'];
    $student10 = $_POST['s10'];  

    // store all the individual arrays in a 2D array (Array of  Arrays)
    $studentArray=[$student1, $student2 ,$student3 ,$student4 ,$student5 ,$student6 ,$student7 ,$student8 ,$student9 ,$student10];
    
    $studentArray=process_array($studentArray);
    
    //custom sort to sort the 2D array on the StudentTotal index (Index 2) in descending order
    usort($studentArray, function ($a, $b){
        return $b[2]<=>$a[2];
    });

    //table styling
    echo "<table style='border-width:5px;'>";
    echo (
        "<tr>  
            <th>Student Name</th>    
            <th>Roll No</th>                
            <th>Total Marks Scored</th>
        </tr> ");

    foreach ($studentArray as $studentXYZ){
        
        $studentName=$studentXYZ[0];
        $studentRoll=$studentXYZ[1];
        $studentTotal=$studentXYZ[2];
        

        echo (
        "<tr>  
            <td>$studentName</td>    
            <td> $studentRoll </td>                
            <td>$studentTotal</td>
        </tr> ");
        
    }
    echo "<table>";
    //FILE HANDLING STARTS HERE
        $fp = fopen('StudentMarks.txt', 'w');  

        //Write the heading and feed newline.
        fwrite($fp, 'Class Student Report (Grade Wise - Highest TO Lowest)');
        fwrite($fp, PHP_EOL);
        foreach ($studentArray as $studentXYZ){
            $studentName=$studentXYZ[0];
            $studentRoll=$studentXYZ[1];
            $studentTotal=$studentXYZ[2];
            fwrite($fp, '---------------------------------------'.PHP_EOL);
            fwrite($fp, '');
            fwrite($fp, 'Name: '. $studentName.PHP_EOL);
            fwrite($fp, 'Roll No: '.$studentRoll.PHP_EOL);
            fwrite($fp, 'Total Marks: '.$studentTotal.PHP_EOL);  

            
        }
    }
    
    //print_r($studentArray); 
    echo "<h4> Dumping Content to a Text File...</h4>"; 
    echo "</center>";

?>
