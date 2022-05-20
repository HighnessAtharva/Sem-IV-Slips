<?php
error_reporting(E_ERROR | E_PARSE);
if (isset($_FILES['f'])) {
    $errors = array();
    $file_name = $_FILES['f']['name'];
    $file_size = $_FILES['f']['size'];
    $file_tmp = $_FILES['f']['tmp_name'];
    $file_type = $_FILES['f']['type'];
    $file_ext = strtolower(end(explode('.', $_FILES['f']['name'])));

    $extensions = array("jpeg", "jpg", "png");

    if (in_array($file_ext, $extensions) === false) {
        $errors[] = "extension not allowed, please choose a JPEG or PNG file.";
    }

    if (empty($errors) == true) {
        move_uploaded_file($file_tmp, "images/" . $file_name);
        echo "Success";
    } else {
        print_r($errors);
    }
}
?>

<html>
   <body>
      <form action = "" method = "POST" enctype = "multipart/form-data">
         <input type = "file" name = "f" />
         <input type = "submit"/>

         <ul>
            <li>Sent file: <?php echo $_FILES['f']['name']; ?>
            <li>File size: <?php echo $_FILES['f']['size']; ?>
            <li>File type: <?php echo $_FILES['f']['type'] ?>
         </ul>

      </form>
   </body>
</html>