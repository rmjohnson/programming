<?php
require("../header.php");
require("../connect.php");
	$result = mysql_query("SELECT * FROM news ORDER BY updated DESC") or die(mysql_error());
	while($row = mysql_fetch_array( $result )) {
		echo "<div id=\"content\">";
		echo $row['title'];
		echo "<hr />";
		echo "<p>";
		echo $row['content'];
		echo "</p>";
		echo "</div>";
		echo "<br />";
	}
require("../footer.php");
?>
