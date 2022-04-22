<?php
session_start();
$t = date("1,d-m-y h:i:s", time() + 20);

if ($_REQUEST['name'] == 'admin' && $_REQUEST['pwd'] == 'password') {
    ?>


<html>
<body>
<h1>  <u><center>enter ur details</center></u>  </h1>
<form action="accept_expire.php" method=get>
<input type='hidden' name='etime' value="<?php echo $t ?>">
<h2>  Enter Name : <input type=textbox name=uname>   </h2><br>
<h2>  Enter City : <input type=textbox name=city>          </h2><br>
<h2>  Enter Phone No : <input type=textbox name=pno> </h2><br>
<input type=submit name=submit value=DISPLAY>
</form>
</body>
</html>


<?php
} else {
    echo "<center><h1>Invalid Username Or Password</h1></center>";
}
?>
