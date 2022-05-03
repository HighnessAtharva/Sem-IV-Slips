<?php
$auth_yes = 0;
session_start();
session_register();
#tm=time();
?>

<form method="GET" action="new.php">
<fieldset>
    <legend>Enter username and password</legend>
    <p>Roll_No:&nbsp&nbsp&nbsp<input type="text" name="rno"><br>
    <p>Name:&nbsp&nbsp&nbsp<input type="text" name="nm"><br>
    <p>City:&nbsp&nbsp&nbsp:&nbsp&nbsp&nbsp<input type="text" name="ct"><br><br>
    <input type="submit" value=Submit>
</form>
