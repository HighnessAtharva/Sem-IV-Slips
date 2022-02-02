<!--8)Create a text file with this text – “I am a student of BMCC. I am studying in SYBBA (CA).” and name it aboutme.txt, after which write a PHP script to display the contents of this file and add the following line to it. “I like to play sports, read books and play music.” and display the file content.  (15 marks)-->

<?php    
$filename = "AboutMe.txt";    

//a + is used to Open file in read-write mode. It places the file pointer to the end of the file. If file is not found, it creates a new file.

//open file in read mode   
$aboutMe = fopen($filename, "a+"); 


//read already made file and print it to browser
$fp = fread($aboutMe, filesize($filename));   
echo $fp;
echo "<br>";

echo "</b>Displaying additions below </b>";

//additions
fwrite($aboutMe, "\n");
fwrite($aboutMe, ' I like to play sports, read books and play music.');  


//display the file with additions. 
$fp2 = fread($aboutMe, filesize($filename)); 

echo $fp2;
echo "<br>";
//close file
fclose($aboutMe);  
?> 