<?php if (!isset($_POST['submit'])) { ?>
<html>
	<head>
		<title>Mediation Help Request Form</title>
		<link rel="stylesheet" type="text/css" href="../style.css" />
	</head>
	<body>
		<div id="request">
		<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
			<h3>Personal Information</h3>
			Date:<input type="text" name="date"><br />
			Name:<input type="text" name="name">
			Age:<input type="text" name="age"><br />
			Mailing Address:<input type="text" name="address">
			Zip:<input type="text" name="zip"><br />
			Email:<input type="text" name="email"><br />
			Telephone:<br />
			<ul>
				<li>Daytime:<input type="text" name="dayphone"></li>
				<li>Evening:<input type="text" name="eveningphone"></li>
				<li>Fax:<input type="text" name="fax"></li>
			</ul>
			Employer:<input type="text" name="employer">
			Occupation:<input type="text" name="occupation"><br />
			Referred by:<input type="text" name="referred"><br />
			Marital Status(mark all that apply):<br />
			<input type="checkbox" name="nevermarried" value="t">Never married<br />
			<input type="checkbox" name="widowed" value="t">Widowed<br />
			<input type="checkbox" name="divorced" value="t">Previously Divorced<br />
			<input type="checkbox" name="nowmarried" value="t">Now Married:<input type="text" name="marriedyears">Yrs<br />
			<input type="checkbox" name="seperated" value="t">Now seperated:<input type="text" name="seperatedyears">Yrs<br />
			Spouse's name:<input type="text" name="spousename">
			Age:<input type="text" name="spouseage"><br />
			Please give the names and ages of your children:<br /><textarea name="children"></textarea><br />
			Briefly describe any significant health issues that might impair your ability to effectively participate in mediation:<br /><textarea name="healthissues"></textarea><br />
			If you have talked or intend to talk with an attorney about your problem, please provide the information:<br />
			Attorney:<input type="text" name="attorney">
			Firm:<input type="text" name="firm"><br />
			Address:<input type="text" name="firmaddress"><br />
			Has a legal action been filed or is one likely to be filed in this situation?
			<input type="radio" name="legalaction" value="no">No
			<input type="radio" name="legalaction" value="yes">Yes<br />
			<textarea name="legalactiondescription"></textarea><br />
			Have you received advice from anyone else regarding this situation?<br />
			<input type="radio" name="advice" value="no">No
			<input type="radio" name="advice" value="yes">Yes<br />
			<text area="advicedescription"></textarea><br />
			<center><font size="5" color="blue"><b>If it is possible, as far as it depends on you, live at peace with everyone.</b></font><br />
			<font size="3" color="blue">Romans 12:18</font></center>
			<h3>Religious Background</h4>
			<p>We found that a person's religious background can have a significant impact on how he or she deals with conflict. In order for us to be sensitive to your personal convictions, it is helpful for us to receive the following information at the outset of the conciliation process. </p>
			Religion:<br />
			<input type="radio" name="religion" value="none">None
			<input type="radio" name="religion" value="christian">Christian
			<input type="radio" name="religion" value="jewish">Jewish
			<input type="radio" name="religion" value="agnostic">Agnostic
			<input type="radio" name="religion" value="other">Other <input type="text" name="otherreligion"><br />
			Please describe your religious upbringing:<br />
			Do you believe in God?
			<input type="radio" name="believegod" value="no">No
			<input type="radio" name="believegod" value="yes">Yes
			<input type="radio" name="believegod" value="uncertain">Uncertain
			If yes or uncertain:<textarea name="believegodexplanation"></textarea><br />
			Do you believe that when you die you will be with God eternally?
			<input type="radio" name="godeternal" value="no">No
			<input type="radio" name="godeternal" value="yes">Yes
			<input type="radio" name="godeternal" value="uncertain">Uncertain<br />
			Why?<br /><textarea name="godeternalwhy"></textarea><br />
			Have there been any recent significant changes in your spiritual life?
			<input type="radio" name="spiritualchanges" value="no">No
			<input type="radio" name="spiritualchanges" value="yes">Yes (describe below)<br />
			<textarea name="spiritualchangesdescription"></textarea><br />
			If you currently belong to or attend a church, please provide the following information:<br />
			Church:<input type="text" name="yourchurch">
			Pastor:<input type="text" name="yourpastor"><br />
			Address:<input type="text" name="yourchurchaddress">
			Phone:<input type="text" name="yourchurchphone"><br />
			Are you a member?
			<input type="radio" name="member" value="no">No
			<input type="radio" name="member" value="yes">Yes, since <input type="text" name="membersince"><br />
			How often do you attend church meetings?<br />
			<input type="radio" name="churchmeetings" value="perweek"><input type="text" name="timesperweek" maxlength="2" size="2"> Times per week
			<input type="radio" name="churchmeetings" value="irregularly">Irregularly
			<input type="radio" name="churchmeetings" value="seldom">Seldom
			<input type="radio" name="churchmeetings" value="never">Never<br />
			Desribe any church leadership positions you hold or activities you are involved in:<br />
			<textarea name="leadership"></textarea><br />
			How often do you read or study the Bible?
			<input type="radio" name="readbible" value="daily">Daily
			<input type="radio" name="readbible" value="weekly">Irregularly
			<input type="radio" name="readbible" value="irregularly">Irregularly
			<input type="radio" name="readbible" value="seldom">Seldom
			<input type="radio" name="readbible" value="never">Never<br />
			<input type="radio" name="opinionbible" value="dontknow">I don’t know enough about the Bible to have an opinion.<br />
			<input type="radio" name="opinionbible" value="followordisregard">It is a book that contains helpful principles that I am free to follow or disregard as I think best.<br />
			<input type="radio" name="opinionbible" value="followunless">It is a book that was inspired by God and that contains helpful principles and instructions that I should follow unless I believe there is a good reason to do otherwise.<br />
			<input type="radio" name="opinionbible" value="followregardless">It is a book that was inspired by God and that contains helpful principles, instructions, and commands that I should follow regardless of my feelings or preferences.<br />
			<input type="radio" name="opinionbible" value="other">Other:<input type="text" name="opinionbibleother"><br />
			Who, if anyone, has the most influence on your religious or spiritual life? Please give names and relationships.<br />
			<textarea name="mostinfluence"></textarea>
			<h3>Information on the Other Person</h3>
			Please provide as much information as possible regarding the other person in this dispute. If there is more than one other person, please mark the box below and provide the same information about them on the back of this sheet.<br />
			Name:<input type="text" name="othername"><br />
			Relationship with you:<input type="text" name="relationship">
			For how long?<input type="text" name="relationshiplong"><br />
			Mailing Address:<input type="text" name="otheraddress">
			Zip:<input type="text" name="otherzip"><br />
			Email:<input type="text" name="otheremail"><br />
			Telephone:<br />
			<ul>
				<li>Daytime:<input type="text" name="otherdayphone"></li>
				<li>Evening:<input type="text" name="othereveningphone"></li>
				<li>Fax:<input type="text" name="otherfax"></li>
			</ul>
			Church:<input type="text" name="otherchurch">
			Attorney:<input type="text" name="otherattorney"><br />
			Employer:<input type="text" name="otheremployer">
			Occupation:<input type="text" name="otheroccupation"><br />
			Please provide as much information as possible on this person’s religious orientation and commitment:<br />
			<textarea name="otherreligion"></textarea><br />
			<h3>Information on Your Problem or Dispute</h3><br />
			<i>Before you complete this section, please read all six questions so that you can see how to organize your answers.</i><br />
			<ol type="A">
				<li>Briefly describe your problem or dispute (you can give us more detailed information later during  an interview): </li>
				<textarea name="infoa"></textarea>
				<li>What have you done to resolve this problem or dispute?</li>
				<textarea name="infob"></textarea>
				<li>What issues or questions do you want to have resolved or answered?</li>
				<textarea name="infoc"></textarea>
				<li>What do you want us to do?  What are your hopes and expectations in coming here?</li>
				<textarea name="infod"></textarea>
				<li>If this is a legal matter, what claim or remedy do you seek? (Include dollar amount, if any)</li>
				<textarea name="infoe"></textarea>
				<li>Is there any other information we should know?</li>
				<textarea name="infof"></textarea>
			</ol>
			<input type="submit" value="Submit!" name="submit">
		</form>
		</div>
	</body>
</html>
<?php
} else {
$date = $_POST['date'];
$name = $_POST['name'];
$age = $_POST['age'];
$address = $_POST['address'];
$zip = $_POST['zip'];
$email = $_POST['email'];
$dayphone = $_POST['dayphone'];
$eveningphone = $_POST['eveningphone'];
$fax = $_POST['fax'];
$employer = $_POST['employer'];
$occupation = $_POST['occupation'];
$referred = $_POST['referred'];
$nevermarried = $_POST['nevermarried'];
$widowed = $_POST['widowed'];
$divorced = $_POST['divorced'];
$nowmarried = $_POST['nowmarried'];
$marriedyears = $_POST['marriedyears'];
$seperated = $_POST['seperated'];
$seperatedyears = $_POST['seperatedyears'];
$spousename = $_POST['spousename'];
$spouseage = $_POST['spouseage'];
$children = $_POST['children'];
$attorney = $_POST['attorney'];
$firm = $_POST['firm'];
$firmaddress = $_POST['firmaddress'];
$legalaction = $_POST['legalaction'];
$legalactiondescription = $_POST['legalactiondescription'];
$advice = $_POST['advice'];
$advicedescription = $_POST['advicedescription'];
$religion = $_POST['religion'];
$otherreligion = $_POST['otherreligion'];
$believegod = $_POST['believegod'];
$believegodexplanation = $_POST['believegodexplanation'];
$godeternal = $_POST['godeternal'];
$godeternalwhy = $_POST['godeternalwhy'];
$spiritualchanges = $_POST['spiritualchanges'];
$spiritualchangesdescription = $_POST['spiritualchangesdescription'];
$yourchurch = $_POST['yourchurch'];
$yourpastor = $_POST['yourpastor'];
$yourchurchaddress = $_POST['yourchurchaddress'];
$yourchurchphone = $_POST['yourchurchphone'];
$member = $_POST['member'];
$churchmeetings = $_POST['churchmeetings'];

$leadership = $_POST['leadership'];
$readbible = $_POST['readbible'];
$opinionbible = $_POST['opinionbible'];
$opinionbibleother = $_POST['opinionbibleother'];
$mostinfluence = $_POST['mostinfluence'];
$othername = $_POST['othername'];
$relationship = $_POST['relationship'];
$relationshiplong = $_POST['relationshiplong'];
$otheraddress = $_POST['otheraddress'];
$otherzip = $_POST['otherzip'];
$otheremail = $_POST['otheremail'];
$otherdayphone = $_POST['otherdayphone'];
$othereveningphone = $_POST['othereveningphone'];
$otherfax = $_POST['otherfax'];
$otherchurch = $_POST['otherchurch'];
$otherattorney = $_POST['otherattorney'];
$otheremployer = $_POST['otheremployer'];
$otheroccupation = $_POST['otheroccupation'];
$otherreligion = $_POST['otherreligion'];
$infoa = $_POST['infoa'];
$infob = $_POST['infob'];
$infoc = $_POST['infoc'];
$infod = $_POST['infod'];
$infoe = $_POST['infoe'];
$infof = $_POST['infof'];


//$to = "adudley@salemalliance.org";
$to = "rjohnson2011@gmail.com";
$subject = "Mediation Help Requested";
$message = " Date: " . $date . "\n" .
		   "Name: " . $name . "\n" .
		   "Age: " . $age . "\n" .
		   "Address: " . $address . "\n" .
		   "Zip: " . $zip . "\n" . 
		   "Email: " . $email . "\n" .
		   "Day Phone: " . $dayphone . "\n" .
		   "Evening Phone: " . $eveningphone . "\n" .
		   "Fax: " . $fax . "\n" .
		   "Employer: " . $employer . "\n" .
		   "Occupation: " . $occupation . "\n" .
		   "Referred by: " . $referred . "\n";
if ($nevermarried == "t") {
	$message = $message . " Never Married: Yes" . "\n";
} else {
	$message = $message . " Never Married: No" . "\n";
}
if ($widowed == "t") {
	$message = $message . " Widowed: Yes" . "\n";
} else {
	$message = $message . " Widowed: No" . "\n";
}
if ($divorced == "t") {
	$message = $message . " Divorced: Yes" . "\n";
} else {
	$message = $message . " Divorced: No" . "\n";
}
if ($seperated == "t") {
	$message = $message . " Seperated: Yes" . ", for " . $seperatedyears . " years.\n";
} else {
	$message = $message . " Seperated: No" . "\n";
}
if ($nowmarried == "t") {
	$message = $message . " Now Married: Yes" . ", for " . $marriedyears . " years.\n";
} else {
	$message = $message . " Now Married: No" . "\n";
}

$message = $message . "Spouse Name: " . $spousename . "\n" .
                      "Spouse Age: " . $spouseage . "\n" .
					  "Children: " . $children .  "\n" .
					  "Attorney: " . $attorney . "\n" .
					  "Firm: " . $firm . "\n" .
					  "Firm Address: " . $firmaddress .  "\n" .
					  "Legal Action: " . $legalaction . "\n" .
					  "Legal Description: " . $legaldescription . "\n" .
					  "Recieved Advice: " . $advice . "\n" .
					  "Advice Description: " . $advicedescription .  "\n";

if ($religion == "other") {
	$message = $message . "Religion: " . $otherreligion . "\n";
} else {
	$message = $message . "Religion: " . $religion . "\n";
}
$message = $message . "Believes in God: " . $believegod . "\n" .
					  "Explanation: " . $believegodexplanation . "\n" .
					  "Think you'll be with God for eternity: " . $godeternal . "\n" .
					  "Why: " . $godeternalwhy .  "\n" .
					  "Recent spiritual changes: " . $spiritualchanges .  "\n" .
					  "Recent spiritual changes description: " . $spiritualchangesdescription .  "\n" .
					  "Your church: " . $yourchurch .  "\n" .
					  "Your pastor: " . $yourpastor . "\n" .
					  "Your church address: " . $yourchurchaddress .  "\n" .
					  "Your church phone: " . $yourchurchphone .  "\n" .
					  "Member of the church: " . $member . "\n";
					  
if ($churchmeetings == "perweek") {
	$message = $message . "How often do you attend church meetings: " . $timesperweek . "times per week.\n";
} else {
	$message = $message . "How often do you attend church meetings: " . $churchmeetings .  "\n";
}

$message = $message . "Leadership role: " . $leadership . "\n" .
					  "Read the Bible: " . $readbible . "\n";
					  				  
if ($opinionbible == "dontknow") {
	$message = $message . "Opinion on the Bible: I don’t know enough about the Bible to have an opinion.\n";
} elseif ($opinionbible == "followordisregard") {
	$message = $message . "It is a book that contains helpful principles that I am free to follow or disregard as I think best.\n";
} elseif ($opinionbible == "followunless") {
	$message = $message . "It is a book that was inspired by God and that contains helpful principles and instructions that I should follow unless I believe there is a good reason to do otherwise.\n";
} elseif ($opinionbible == "followregardless") {
	$message = $message . "It is a book that was inspired by God and that contains helpful principles, instructions, and commands that I should follow regardless of my feelings or preferences.\n";
} elseif ($opinionbible == "other") {
	$message = $message . $opinionbibleother . "\n";
}
					  					  
$message = $message . "Most influence on spiritual life: " . $mostinfluence . "\n" .
					  "Other person's name: " . $othername . "\n" .
					  "Relationship with other person: " . $relationship . "\n" .
					  "for " . $relationshiplong . " years" . "\n" .
					  "Other person's address: " . $otheraddress .  "\n" .
					  "Other person's zip code: " . $otherzip . "\n" .
					  "Other person's email: " . $otheremail . "\n" .
					  "Other person's day phone: " . $otherdayphone . "\n" .
					  "Other person's evening phone: " . $othereveningphone .  "\n" .
					  "Other person's fax: " . $otherfax .  "\n" .
					  "Other person's church: " . $otherchurch .  "\n" .
					  "Other person's attorney: " . $otherattorney .  "\n" .
					  "Other person's employer: " . $otheremployer .  "\n" .
					  "Other person's occupation: " . $otheroccupation .  "\n" .
					  "Other person's religion: " . $otherreligion .  "\n" .
					  "Briefly describe your problem or dispute (you can give us more detailed information later during  an interview):\n" . $infoa .  "\n" .
					  "What have you done to resolve this problem or dispute?\n" . $infob . "\n" .
					  "What issues or questions do you want to have resolved or answered?\n" . $infoc . "\n" .
					  "What do you want us to do?  What are your hopes and expectations in coming here?\n" . $infod . "\n" .
					  "If this is a legal matter, what claim or remedy do you seek? (Include dollar amount, if any)\n" . $infoe .  "\n" .
					  "Is there any other information we should know?\n" . $infof;

//Send it!
mail($to,$subject,$message);

echo "Success!";
}
?>