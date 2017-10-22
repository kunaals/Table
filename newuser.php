<h1>New User</h1>


<?php 
    if(isset($_POST['submit'])) {
        echo "Thank You!";
    } else {
        echo 'Please enter MyUw username and password: <br><br>
        <form method="POST" action="'.$_SERVER['PHP_SELF'].'">
        User name:<br>
        <input type="text" name="username" value="">
        <br>
        Password:<br>
        <input type="password" name="password" value="">
        <br><br>
        <input type="submit" name="submit" value="Submit">
      </form> ';
    }
?>




<a href="index.html">go back</a>