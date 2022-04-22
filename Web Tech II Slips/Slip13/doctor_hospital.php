<?php
$hosp = $_GET['hosp'];
$con = mysqli_connect("localhost", "root", "","bca_programs");

$sql="select doctor.doc_no,doc_name,address,city,area from doctor,hospital,doc_hosp where hosp_name='$hosp' and doc_hosp.doc_no=doctor.doc_no and doc_hosp.hosp_no=hospital.hosp_no";
$q = mysqli_query($con, $sql);

echo "<tr><td>Doctor no--</td><td>Doctor Name--</td><td>Address--</td><td>city--</td><td>Area</td><tr>";
echo "<br>";
while ($row = mysqli_fetch_array($q)) {
    echo "
<tr><td>" . $row[0] . " | </td><td>" . $row[1] . " | </td><td>" . $row[2] . " | </td><td>" . $row[3] . " </td><td>" . $row[4] . " |</td></tr>";
}

mysqli_close($con);
?>
