<!-- Write a PHP program to validate the data from a self-processing form containing username and password for empty strin -->

<!DOCTYPE HTML>  
<html>
<head>
</head>
<body>  

<?php
// define variables and set to empty values
$name = $password= "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
  $name = test_input($_POST["name"]);
  $password = test_input($_POST["password"]);
  if (empty($name)) {
    echo "Name is required<br>";
  }
  if (empty($password)) {
    echo "Password is required<br>";
  }

  if (!empty($name) && !empty($password)) {
    echo "Welcome " . $name . "!<br> Login Successful";
  }
}

function test_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}
?>

<h2>PHP Form Validation Example</h2>
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">  
  Name: <input type="text" name="name">
  <br><br>
  password: <input type="password" name="password">
  <br><br>
  <input type="submit" name="submit" value="Submit">  
</form>

</body>
</html>