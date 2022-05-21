<!-- Write PHP program to accept a string and print its md5(), sha1() and encrypt() output. In the output, first print original string -->



<html>
<body>
<form method="post" action="">
Enter a String: <input type="text" name="str">
<input type="submit" name="submit" value="Submit">
</form>
</body>
</html>


<?php
if(isset($_POST['submit'])){
    $str = $_POST['str'];
    echo "Original String: ".$str."<br>";
    echo "MD5: ".md5($str)."<br>";
    echo "SHA1: ".sha1($str)."<br>";
    echo "Encrypt: ".crypt($str, 'atharva');
}
?>