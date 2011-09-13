<?php if (!isset($_POST['submit'])) { ?>
<html>
	<head>
		<title>Mediation Help Request Form</title>
		<link rel="stylesheet" type="text/css" href="../style.css" />
	</head>
	<body>
		<div id="request">
		<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
			<center><h3>Do I need Peacemaker Coaching?</h3></center>
			<ul>
				<li>Do I have unresolved conflict?</li>
				<li>Do I want to resolve this conflict in a Christ- like way?</li>
				<li>Do I want to bring glory to God?</li>
				<li>Do I want to be reconciled?</li>
			</ul>
			Name: <input type="text" name="name"><br />
			Phone: <input type="text" name="phone"><br />
			Email: <input type="text" name="email"><br />
			<br />
			<input type="checkbox" name="moreinfo" value="t">I would like more information on Peacemaker Ministries<br />
			<input type="checkbox" name="discuss" value="t">I would like to discuss a conflict<br />
			<br />
			The person contacting me should know:<br />
			<textarea name="shouldknow" rows="5" cols="50"></textarea><br />
			<input type="submit" value="Submit!" name="submit">
		</form>
		</div>
	</body>
</html>
<?php
} else {
$name = $_POST['name'];
$phone = $_POST['phone'];
$email = $_POST['email'];
$moreinfo = $_POST['moreinfo'];
$discuess = $_POST['discuss'];

$to = "rjohnson2011@gmail.com";
$subject = "Coaching Help Requested";


$headers = 'From: PeaceMakersOnline' . "\r\n";
$message = "Name: " . $name . "\n" .
           "Phone: " . $phone . "\n" .
		   "Email: " . $email . "\n";
if ($moreinfo == "t") {
	$message = $message . "I would like more information on Peacemaker Ministries.\n";
} else {
	$message = $message . "I do not need more information on Peacemaker Ministries.\n";
}
if ($discuss == "t") {
	$message = $message . "I would like to discuss a conflict.\n";
} else {
	$message = $message . "I don't need to discuss a conflict.\n";
}
$message = $message . "The person contacting me should know:" . $shouldknow . "\n";

mail($to,$subject,$message, $headers);
echo "Success!";
}