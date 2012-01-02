<?php 
	include("adminheader.php");
	//$result = mysql_query("SELECT * FROM overview") or die(mysql_error());
	//$row = mysql_fetch_array($result);
?>

		<center>
		<?php
		if($_GET['page'] == '') {
		?>
		Which overview page would you like to edit?
		<ul>
			<li><a href="overview.php?page=whatis">What is Peacemakers?</a></li>
			<li><a href="overview.php?page=why">Why Peacemakers?</a></li>
			<li><a href="overview.php?page=whatdo">What do we offer?</a></li>
		</ul>
		<?php
		} elseif($_GET['page'] == 'whatis') {
		?>
		<form action="confirm.php" method="post">
			<h3>What is Peacemakers?</h3>
			<br /><textarea id="content" name="content" style="width:80%;height:200px;">
				<?php
					$result = mysql_query("SELECT * FROM overview_whatis") or die(mysql_error());
					$row = mysql_fetch_array($result);
					echo $row['content']; 
				?>
			</textarea><br />
			<input type="hidden" name="page" value="whatis">
			<input type="submit" name="submit" value="Submit!">
			<br /><br />
			<a href="overview.php">Select a different overview page</a>
		</form>
		
		<?php
		} elseif($_GET['page'] == 'why') {
		?>
		<form action="confirm.php" method="post">
			<h3>Why Peacemakers?</h3>
			<br /><textarea id="content" name="content" style="width:80%;height:200px;">
				<?php
					$result = mysql_query("SELECT * FROM overview_why") or die(mysql_error());
					$row = mysql_fetch_array($result);
					echo $row['content']; 
				?>
			</textarea><br />
			<input type="hidden" name="page" value="why">
			<input type="submit" name="submit" value="Submit!">
			<br /><br />
			<a href="overview.php">Select a different overview page</a>
		</form>
		
		<?php
		} elseif($_GET['page'] == 'whatdo') {
		?>
		<form action="confirm.php" method="post">
			<h3>What do we offer?</h3>
			<br /><textarea id="content" name="content" style="width:80%;height:200px;">
				<?php
					$result = mysql_query("SELECT * FROM overview_whatdo") or die(mysql_error());
					$row = mysql_fetch_array($result);
					echo $row['content']; 
				?>
			</textarea><br />
			<input type="hidden" name="page" value="whatdo">
			<input type="submit" name="submit" value="Submit!">
			<br /><br />
			<a href="overview.php">Select a different overview page</a>
		</form>
		<?php
		}
		?>
		<br /><br />
		<a href="index.php">Go back to the main admin panel</a>
		</center>
	</body>
</html>