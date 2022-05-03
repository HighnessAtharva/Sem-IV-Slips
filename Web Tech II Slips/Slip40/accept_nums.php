<?php

    $num = strip_tags($_POST["num"]);
    echo "<form action='write_to_file.php' method='post'>";
    for ($i=0; $i < $num; $i++) { 
        echo "Enter Number " . ($i+1) . ": ";
        echo "<input type='number' name='nums[]'><br><br>";
    }
    echo "<input type='submit' name='submit' value='Submit'>";
    echo "</form>";
    
?>