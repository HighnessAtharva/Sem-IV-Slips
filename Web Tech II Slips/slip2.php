<!--2)Write a PHP script to accept a string from the user and display the message whether it is a palindrome or not. (15 marks)-->
<h2> Palindrome Checker </h2>
<form method="post">
Enter a Number: <input type="text" name="num"/><br>
<button type="submit" nmae="submit">Check</button>
</form>
<?php
if (isset($_POST['submit'])) {
    //get the value from form
    $num = $_POST['num'];
    //reversing the number
    $reverse = strrev($num);

    //checking if the number and reverse is equal
    if ($num == $reverse) {
        echo "The number $num is Palindrome";
    } else {
        echo "The number $num is not a Palindrome";
    }
}
?>