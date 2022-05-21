<?php
$auth_yes = 0;
session_start();
session_register();
#tm=time();
?>

<form method="GET" action="new.php">
    <p>Roll_No:<input type="text" name="rno"><br>
    <p>Name:<input type="text" name="nm"><br>
    <p>City:<input type="text" name="ct"><br><br>
    <input type="submit" value=Submit>
</form>
