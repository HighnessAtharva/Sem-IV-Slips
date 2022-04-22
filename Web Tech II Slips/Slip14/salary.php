<?php

$con = mysqli_connect("localhost", "root", "","bca_programs");
$sql="SELECT deptno, min(esalary), max(esalary), avg(esalary) FROM `employee`, `department` group by deptno";
$q = mysqli_query($con, $sql);
while ($row = mysqli_fetch_array($q)) {
    echo "Department No: " . $row[0] . " | " . "Min Salary: " . $row[1] . " | " . "Max Salary: " . $row[2] . " | " . "Avg Salary: " . $row[3] . " | ";
    echo "<BR>";
}
mysqli_close($con);
?>
