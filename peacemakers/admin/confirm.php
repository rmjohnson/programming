<?php
require("adminheader.php");
if (!isset($_POST['submit'])) {
header('Location: index.php');
} else {
$title = $_POST['title'];
$author = $_POST['author'];
$content = $_POST['content'];
$date = date( 'Y-m-d H:i:s', mktime(0,0,0, $_POST['month'], $_POST['day'], "20" . $_POST['year'] ));
$page = $_POST['page'];

echo "This is the information you entered, is this correct?";
echo "<br />";
if ($page == "events") {
	echo "Date: " . date('m/d/y',strtotime($date)) . "<br />";
	echo "Description: " . $content . "<br />";
} else {
	echo "Content: <br /><div id=\"content\">" . $content . "</div><br />";
}

?>
<form action="process.php" method="post">
<input type="hidden" name="title" value="<?php  echo $title; ?>">
<input type="hidden" name="author" value="<?php echo $author; ?>">
<input type="hidden" name="content" value="<?php echo addslashes(htmlspecialchars($content)); ?>">
<input type="hidden" name="date" value="<?php echo $date; ?>">
<input type="hidden" name="page" value="<?php echo $page; ?>">
<input type="submit" name="yes" value="Yes">
<input type="button" onClick="window.location.href='<?php echo $page; ?>.php'" name="no" value="No">

<?php } ?>