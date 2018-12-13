<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<header>
	<script>
		document.addEventListener("click", function() {

			alert("successfully configured!");			
			alert("color of the sanjay is : "+document.getElementById("name").style.color);

		});
	</script>
</header>
<body>
	<span><em>Hi <span style="color: red;" id="name">Sanjay!</span></em></span>
</body>
</html>