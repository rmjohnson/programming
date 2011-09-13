<?php if (!isset($_POST['submit'])) { ?>
<html>
	<head>
		<title>Request More Information</title>
		<link rel="stylesheet" type="text/css" href="../style.css" />
	</head>
	<body>
		<div id="request">
		<h3>Request more information</h3>
		<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
			Name: <input type="text" name="name"><br />
			Please tell us how to contact you:<br /><textarea rows="4" cols="60" name="how"></textarea><br />
			<input type="submit" value="Submit!" name="submit">
		</form>
		</div>
	</body>
</html>
<?php
} else {
$name = $_POST['name'];
$how = $_POST['how'];
$to = "rcsteinor@gmail.com";
$subject = "More Information Request";
$message = "Name: " . $name . "\n" .
		   "How to contact them: " . $how . "\n";

//Send it!
mail($to,$subject,$message);

echo "Success!";
}
?>