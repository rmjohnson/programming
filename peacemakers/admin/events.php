<?php
	require("adminheader.php");
?>
		<center>
		<form action="confirm.php" method="post">
			Title: &nbsp;<input type="text" name="title">
			Day of event: &nbsp;
				<select name="month">
					<option value="01">Jan</option>
					<option value="02">Feb</option>
					<option value="03">Mar</option>
					<option value="04">Apr</option>
					<option value="05">May</option>
					<option value="06">Jun</option>
					<option value="07">Jul</option>
					<option value="08">Aug</option>
					<option value="09">Sep</option>
					<option value="10">Oct</option>
					<option value="11">Nov</option>
					<option value="12">Dec</option>
				</select>
				<select name="day">
					<?php
						for($i = 1; $i <=31; $i += 1) {
							echo "<option value=\"";
							echo $i;
							echo "\">";
							echo $i;
							echo "</option>";
						}
					?>
				</select>
				<input type="text" name="year" value="YY" size="1" maxlength="2">
				<br />
			Description<br /><textarea id="content" name="content"></textarea><br />
			<br />
			<input type="hidden" name="page" value="events">
			<input type="submit" name="submit" value="Submit!">
		</form>
		</center>
	</body>
</html>