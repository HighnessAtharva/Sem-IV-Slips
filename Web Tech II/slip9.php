<!--9)Write a PHP script to create a text file named mydata.txt and write into it a small essay of 5 lines which is accepted through a HTML form.  (25 marks)-->

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Form to Text File</title>
</head>
<body>
    <h3> Essay Saver </h3>
    <form method="POST" name="essay-form" action="">
        Write a 5 line Essay:<br> 
        <textarea name="mydata" rows="5" cols="50" placeholder="Enter your text here"></textarea><br> 
        <input type="submit">
    </form>
</body>
</html>

<?php 
error_reporting(E_ERROR | E_PARSE);
$userInput=$_POST['mydata'];
file_put_contents("MyData.txt", (htmlspecialchars($userInput)));
if (count($_POST)>0) echo '<hr>Thank You! Your essay can be found in the `MyData.txt` file'; 
?>
