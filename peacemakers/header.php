<?php
require("connect.php");
?>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN">
<html>
	<head>
		<title>Peacemakers</title>
		<link rel="stylesheet" type="text/css" href="../style.css" />
		<script type="text/javascript" src="../flyout.js"></script>
	</head>
	<body>
	<div id="hugewrap">
	<map id="wheat" name="wheat">
		<area shape="rect" alt="Home" coords="276,68,314,80" href="/index.php" title="Home" />
		<area shape="rect" alt="Calendar" coords="329,69,372,80" href="/events/index.php" title="Calendar" />
		<area shape="rect" alt="Contact Us" coords="389,69,445,81" href="/contact/index.php" title="Contact Us" />
		<area shape="default" nohref="nohref" alt="" />
	</map>
	
	<div id="logo">
		<img src="/images/saclogo.gif">
		<img src="/images/wheat.gif" usemap="#wheat" style="border-style:none; padding:-5px;">
		<br />
		<div id="top_links">
			<table cellpadding="5">
				<tr>
					<td><a href="http://www.salemalliance.org/home/index.php">SAC Homepage</a></td>
					<td><a href="http://www.salemalliance.org/lifepath/welcome.php">Other SAC Resources</a></td>
					<td><a href="http://salemalliance.org/articlepage2.php?p=1&a=183">Gen. SAC Information</a></td>
				</tr>
			</table>
		</div>
		<img src="/images/homeheader3.gif">
	</div>
	<hr>
	<!--
	<div id="banner">
		
	</div> 
	-->
	<div id="navigation">
		<!--
		<table>
			<tr><td><a href="/index.php">Home</a></td></tr>
			<tr><td><a href="/overview/index.php">Program Overview</a></td></tr>
			<tr><td><a href="/events/index.php">Upcoming PM Events</a></td></tr>
			<tr><td><a href="/news/index.php">News</a></td></tr>
			<tr><td><a href="/books/index.php">Buy Books</a></td></tr>
			<tr><td><a href="http://www.hispeace.org">Peacemakers National Site</a></td></tr>
			<tr><td><a href="/contact/index.php">Contact Us</a></td></tr>
		</table>
		-->
		<dl class="dropdown">
			<dt id="one-ddheader" class="upperdd" onclick="window.location = '/index.php'">Home</dt>
		</dl>
		<dl class="dropdown">
			<dt id="two-ddheader" class="upperdd" onmouseover="ddMenu('two',1)" onmouseout="ddMenu('two',-1)">Program Overview</dt>
			<dd id="two-ddcontent" onmouseover="cancelHide('two')" onmouseout="ddMenu('two',-1)">
			<ul>
				<li><a href="/overview/whatis.php" class="underline">What is Peacemakers?</a></li>
				<li><a href="/overview/why.php" class="underline">Why Peacemakers?</a></li>
				<li><a href="/overview/whatdo.php">What do we offer?</a></li>
			</ul>
		</dd>
		</dl>
		<dl class="dropdown">
			<dt id="three-ddheader" class="upperdd" onclick="window.location = '/events/index.php'">Upcoming PM Events</dt>
		</dl>
		<dl class="dropdown">
			<dt id="four-ddheader" class="upperdd" onclick="window.location = '/news/index.php'">Peacemaking Thoughts</dt>
		</dl>
		<dl class="dropdown">
			<dt id="five-ddheader" class="upperdd" onclick="window.location = '/books/index.php'">Buy Books</dt>
		</dl>
		<dl class="dropdown">
			<dt id="six-ddheader" class="upperdd" onclick="window.location = 'http://www.hispeace.org'">Peacemakers National Site</dt>
		</dl>
		<dl class="dropdown">
			<dt id="seven-ddheader" class="upperdd" onclick="window.location = '/contact/index.php'">Contact Us</dt>
		</dl>
		<br />
		<h3>Upcoming Events</h3>
		<table width="170px">
			<?php
			$result = mysql_query("SELECT * FROM events ORDER BY date ASC LIMIT 0,8") or die(mysql_error());
			while($row = mysql_fetch_array( $result )) {
				echo "<tr>";
				echo "<td><font size=\"1\">";
				echo $row['title'];
				echo "</font></td><td><font size=\"1\">";
				echo date("m/d/y",strtotime($row['date']));
				echo "</font></td></tr>";
			}
			?>
		</table>
	</div>
	<div id="header">
		<?php
		/*if ($_SERVER['PHP_SELF'] == "/index.php") {
			print "<img src=\"/images/helpheader.png\">";
			print "<br />";
		}
		*/
		?>
		<img src="/images/helpheader.png"><br />
		<?php
		/*if ($_SERVER['PHP_SELF'] == "/index.php") {
			print "<img src=\"/images/helpbelow.png\">";
		}*/
		?>
	</div>
	<?php
	if ($_SERVER['PHP_SELF'] == "/index.php") {
		echo '<div id="header">';
		echo '<img src="/images/slope.png"><br />';
		echo '</div>';
		echo "<div id=\"help\">";
			echo "<a href=\"/overview/whatdo.php\"><img src=\"images/needhelp.png\" border=\"0\"></a>";
		echo "</div>";
	}
	?>
	<div id="wrap">