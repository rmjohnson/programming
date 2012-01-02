<?php
require("../header.php");
require("../connect.php");
echo '<table width="400">
<tr><td colspan="2" border="0"><center><font size="5">Upcoming Peacemakers Events</font></center></td></tr>
<!--<tr><td><center><font size="4">Title</font></center></td><td><center><font size="4">Dates</font></center></td></tr>-->';
	$result = mysql_query("SELECT * FROM events ORDER BY date ASC") or die(mysql_error());
	while($row = mysql_fetch_array( $result )) {
		echo '<tr><td align="center"><table><tr bgcolor="#005FA9"><td><font color="white" size="3">';
		echo date("M",strtotime($row['date']));
		echo '</font></td></tr><tr><td align="center"><font size="4" style="font-weight:bold">';
		echo date("j",strtotime($row['date']));
		echo "</td></tr></table>";
		echo "</td><td><h4>";
		echo $row['title'];
		echo '</h4><font size="2">';
		echo $row['description'];
		echo "</font></td></tr>";
	}
?>
</table>
<br /><br />
<?php
	require("../footer.php");
?>