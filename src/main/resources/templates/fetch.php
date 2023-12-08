//fetch.php
<?php
  include('dbh.php');
 
  $id = $_POST['id'];
  $sql = "SELECT * FROM user WHERE email_id= $id ";
  $result = mysqli_query($conn,$sql);
 
  $out='';
  while($row = mysqli_fetch_assoc($result)) 
  {   
     $out .=  '<option>'.$row['email_id'].'</option>'; 
  }
   echo $out;
?>