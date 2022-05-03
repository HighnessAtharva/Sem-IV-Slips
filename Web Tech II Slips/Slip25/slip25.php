<?php
error_reporting(E_ERROR | E_PARSE);
if (isset($_POST)) {
    echo "<h3>Marksheet</h3> ";
    $name = $_POST['name'];
    $addr = $_POST['addr'];
    $class = $_POST['class'];

    echo "Name : " . $name . "<br>";
    echo "Address : " . $addr . "<br>";
    echo "Class : " . $class . "<br>";

    echo "Java : " . $_POST['m1'] . "\n";
    echo "PHP : " . $_POST['m2'] . "\n";
    echo "ST : " . $_POST['m3'] . "\n";
    echo "IT : " . $_POST['m3'] . "\n";
    echo "Practical : " . $_POST['m3'] . "\n";
    echo "Project : " . $_POST['m3'] . "\n";
}
?>

<html>
<body>
<form action="" method="post">
    <center>
        <h2>Enter Marks for Student:</h2>
        <table>
        <input type="hidden" value="<?php echo $name; ?>" name="name">
                    <input type="hidden" value="<?php echo $addr; ?>" name="addr">
                    <input type="hidden" value="<?php echo $class; ?>" name="class">
<tr>
    <td>Java : </td>
    <td><input type="text" name="m1"></td>
    <tr>
        <tr>
            <td>PHP : </td>
            <td><input type="text" name="m2"></td>
        </tr>
        <tr>
            <td>ST : </td>
            <td><input type="text" name="m3"></td>
        </tr>
        <tr>
            <td>IT : </td>
            <td><input type="text" name="m4"></td>
        </tr>
        <tr>
            <td>Practical : </td>
            <td><input type="text" name="m5"></td>
        </tr>
        <tr>
            <td>Project : </td>
            <td><input type="text" name="m6"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value=Next></td>
        </tr>
        </table>
        </center>

    </form>
</body>

</html>
