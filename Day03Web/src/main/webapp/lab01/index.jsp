<script>
	function validate(){
		let guess = document.getElementById("guess").value;
		if(isNaN(guess)){
			document.getElementById("error").innerHTML = "Invalid Input";
			return false;
		}
		document.getElementById("error").innerHTML = "";	
		return true;
	}
</script>
<h1>Welcome to the Guessing Game. Enter a number between 1 and 100</h1>
<form action="/play" method="post">
	<input type="text" placeholder="Enter your guess" name="guess" id="guess"/>
	<h4 style="color:red" id="error"></h4>
	<br/>
	<button type="submit" onclick="return validate();">Guess</button>
	<h4>${message}</h4>
	<h5>${attempts}</h5>
</form>