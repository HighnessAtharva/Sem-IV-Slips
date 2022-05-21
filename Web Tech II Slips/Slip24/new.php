<?php
$a = $_GET['rno'];
$b = $_GET['nm'];
$c = $_GET['ct'];
session_start();
$newt = $tm + 60;
if ($newt > time()) {
    echo "time out";
} else {
    echo "Roll_No=$a" . "<br>";
    echo "Name=$b" . "<br>";
    echo "City=$c" . "<br>";
}
session_destroy();
