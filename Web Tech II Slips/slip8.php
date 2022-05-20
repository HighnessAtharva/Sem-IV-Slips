<!--8)Create a text file with this text – “I am a student of BMCC. I am studying in SYBBA (CA).” and name it aboutme.txt, after which write a PHP script to display the contents of this file and add the following line to it. “I like to play sports, read books and play music.” and display the file content.  (15 marks)-->

<?php    
$filename = "AboutMe.txt";       
echo(file_get_contents($filename));
echo "<br>";
echo "</b>Displaying additions below </b>";
echo "<br>";

//additions
file_put_contents($filename, "\n", FILE_APPEND);
file_put_contents($filename, ' I like to play sports, read books and play music.', FILE_APPEND);  

//display the file with additions. 
echo (file_get_contents($filename));
echo "<br>";

?> 