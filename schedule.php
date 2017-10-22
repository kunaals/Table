<h1>New User</h1>


<?php 

    session_start();
    // session_destroy();
    if(!isset($_SESSION['names'])){
        // $array = array();
        // $_SESSION['names'] = $array;
        $_SESSION['names'] = array();
    }
?>

Please enter the names of the people to schedule: <br><br>
<form method="POST" action="<?php $_SERVER['PHP_SELF']?>">
  <input type="text" name="name" value="">
  <br>
  <input type="submit" name="submit" value="Submit">
</form> 

<br><br>
<table>
<tr><th>Members</th></tr>
<?php 
    if(isset($_POST['delete'])) {
        foreach($_POST as $key => $value){
            // echo $key;  
            // echo $_SESSION[$key];
            unset($_SESSION['names'][$key]);
        }
    }

        if(isset($_POST['name']) && $_POST['name'] != "") {
            $_SESSION['names'][] = $_POST['name'];
        }

        echo '<form method="POST" action="'.$_SERVER['PHP_SELF'].'">';
        foreach($_SESSION['names'] as $key => $value){
            echo '<tr><td><input id="checkBox" name="'.$key.'" type="checkbox"></td><td>'.$value.'</td></tr>';
        }
        echo '<input type="submit" name="delete" value="Delete"></form>';

?>
</table>

<br><br>
<a href="index.html">go back</a>

<form action="calendar.php">
    <!-- <input type="hidden" value=""> -->
    <input type="submit" name="go" value="Go!">
</form>
