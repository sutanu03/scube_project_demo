<?php

$serverName = "localhost";
$userName = "root";
$password = "sutanu123";
$dbName = "scube_project";

$conn = mysqli_connect($serverName, $userName, $password, $dbName);

if (!$conn) {
    die("Connection failed : " . mysqli_connect_error());
}

?>