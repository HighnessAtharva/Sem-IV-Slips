<!-- Write a PHP program to accept a string from the user and display it as a) reverse string, b) lowercase string, c) uppercase string, d) first two characters of the string, e) replace first character by the string BMCC. -->

<?php
if(isset($_POST['submit'])){
   
$str = $_POST['str'];
echo "Original String: " . $str . "<br>";
echo "Reverse String: " . strrev($str) . "<br>";
echo "Lowercase String: " . strtolower($str) . "<br>";
echo "Uppercase String: " . strtoupper($str) . "<br>";
echo "First 2 Characters: " . substr($str, 0, 2) . "<br>";
echo "Replace First Character: " . substr_replace($str, "BMCC", 0, 1) . "<br>";
}
?>

<html><body>
<form action="" method="post">
<input type="text" name="str" placeholder="Enter String"><br>
<input type="submit" value="Submit" name="submit">
</form>
</body></html>