<?php
error_reporting(E_ERROR | E_PARSE);
if (isset($_POST)) {
    echo "<h3>Student Details</h3> ";
    $name = $_POST['name'];
    $addr = $_POST['addr'];
    $class = $_POST['class'];

    echo "Name : " . $name . "<br>";
    echo "Address : " . $addr . "<br>";
    echo "Class : " . $class . "<br>";

    $java = $_POST['m1'];
    $php = $_POST['m2'];
    $st = $_POST['m3'];
    $it = $_POST['m4'];
    $practical = $_POST['m5'];
    $project = $_POST['m6'];
    $total = $java + $php + $st + $it + $practical + $project;
    $per = ($total / 600) * 100;

    if (isset($_POST['submit2'])) {
        echo "<h3>Marksheet</h3> ";
        echo ("<table border='1'>");
        echo "<tr><td>Java :</td><td> " . $java . "</td></tr>\n";
        echo "<tr><td>PHP :</td><td> " . $php . "</td></tr>\n";
        echo "<tr><td>ST :</td><td>" . $st . "</td></tr>\n";
        echo "<tr><td>IT :</td><td>" . $it . "</td></tr>\n";
        echo "<tr><td>Practical :</td><td> " . $practical . "</td></tr>\n";
        echo "<tr><td>Project :</td><td> " . $project . "</td></tr>\n";
        echo "<tr><td>Total Marks :</td><td> " . $total . "</td></tr>\n";
        echo "<tr><td>Percentage :</td><td> " . $per . "</td></tr>\n";
        echo ("</table>");
    }
}
?>

<html>
<body>
<form action="" method="post">

        <h2>Enter Marks for Student:</h2>
        <table>
        <input type="hidden" value="<?php echo $name; ?>" name="name">
        <input type="hidden" value="<?php echo $addr; ?>" name="addr">
        <input type="hidden" value="<?php echo $class; ?>" name="class">
<tr>
    <td>Java : </td>
    <td><input type="number" name="m1" max=100></td>
    <tr>
        <tr>
            <td>PHP : </td>
            <td><input type="number" name="m2" max=100></td>
        </tr>
        <tr>
            <td>ST : </td>
            <td><input type="number" name="m3" max=100></td>
        </tr>
        <tr>
            <td>IT : </td>
            <td><input type="number" name="m4" max=100></td>
        </tr>
        <tr>
            <td>Practical : </td>
            <td><input type="number" name="m5" max=100></td>
        </tr>
        <tr>
            <td>Project : </td>
            <td><input type="number" name="m6" max=100></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="submit2"></td>
        </tr>
        </table>
    </form></body></html>
