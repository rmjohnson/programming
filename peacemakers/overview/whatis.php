<?php
require("../header.php");
?>
<div id="content">
	<?php 
		include("../connect.php");
		$result = mysql_query("SELECT * FROM overview_whatis") or die(mysql_error());
		$row = mysql_fetch_array($result);
		echo "<p>";
		echo $row['content'];
		echo "</p>";
	?>
</div>
<?php
	require("../footer.php");
?>