<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>咖啡資料表</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		
	</head>
	<body style="padding: 20px">
		<div>
			<h2>咖啡資料表單</h2>
			<form class="pure-form" method="POST" action="/JavaWeb/coffee">
				<fieldset>
					<legend>Coffee Form</legend>
					<label>咖啡:</label>
					<input name="coffeeCC" type="text" required />
					<p />
					<label>牛奶:</label>
					<input name="milkCC" type="text" required />
					<button type="submit" class="pure-button pure-button-primary">送出</button>
				</fieldset>
			
			</form>
		</div>
	</body>
</html>