<?php
require("../connect.php");
$title = $_POST['title'];
$author = $_POST['author'];
$content = $_POST['content'];
$page = $_POST['page'];
$date = $_POST['date'];

if ($page == "help") {
	mysql_query("DELETE FROM help");
	mysql_query("INSERT INTO help (title, author, content) VALUES('$title', '$author', '$content') ") or die(mysql_error());
	echo "Page updated!";
	echo "<br />";
	echo "<a href=\"../help/\">View the updated help page</a>";
} elseif ($page == "whatis") {
	mysql_query("DELETE FROM overview_whatis");
	mysql_query("INSERT INTO overview_whatis (title, author, content) VALUES('What is Peacemakers?', 'Richard Stein', '$content') ") or die(mysql_error());
	echo "\"What is Peacemakers?\" page updated!";
	echo "<br />";
	echo "<a href=\"../overview/whatis.php\">View the updated \"What is Peacemakers?\" page</a>";
} elseif ($page == "why") {
	mysql_query("DELETE FROM overview_why");
	mysql_query("INSERT INTO overview_why (title, author, content) VALUES('Why Peacemakers?', 'Richard Stein', '$content') ") or die(mysql_error());
	echo "\"Why Peacemakers?\" page updated!";
	echo "<br />";
	echo "<a href=\"../overview/why.php\">View the updated \"Why Peacemakers?\" page</a>";
} elseif ($page == "whatdo") {
	mysql_query("DELETE FROM overview_whatdo");
	mysql_query("INSERT INTO overview_whatdo (title, author, content) VALUES('What do we offer?', 'Richard Stein', '$content') ") or die(mysql_error());
	echo "\"What do we offer?\" page updated!";
	echo "<br />";
	echo "<a href=\"../overview/whatdo.php\">View the updated \"What do we offer?\" page</a>";
} elseif ($page == "news") {
	mysql_query("DELETE FROM news");
	mysql_query("INSERT INTO news (title, author, content) VALUES('<h3><center>Peacemaking Thoughts</center></h3>', 'Richard Stein', '$content') ") or die(mysql_error());
	echo "Peacemaking thoughts updated!";
	echo "<br />";
	echo "<a href=\"../news/\">View the updated peacemaking thoughts page</a>";
} elseif ($page == "events") {
	mysql_query("INSERT INTO events (title, date, description) VALUES('$title', '$date', '$content') ") or die(mysql_error());
	echo "Events updated!";
	echo "<br />";
	echo "<a href=\"../events/\">View the updated events page</a>";
} else {
	echo "An error has occured.";
	echo '$page = ' . $page;
	echo '$title = ' . $title;
	echo '$author = ' . $author;
}
?>
<br />
<a href="index.php">Return to the admin page</a>