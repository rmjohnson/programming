<?php
	require("adminheader.php");
?>
<center>
	<br /><br />
	<form action="confirm.php" method="post">
		<h3>Peacemaking Thoughts</h3>
		<textarea id="content" name="content" style="width:80%;height:200px;">
			<?php
				$result = mysql_query("SELECT * FROM news ORDER BY updated DESC") or die(mysql_error());
				$row = mysql_fetch_array($result);
				echo $row['content'];				
			?>
		</textarea><br />
		<input type="hidden" name="page" value="news">
		<input type="submit" name="submit" value="Submit!">
	</form>
</center>
</body>
</html>