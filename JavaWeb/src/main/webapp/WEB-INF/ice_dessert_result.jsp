<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<html>
	<head>
		<meta charset="UTF-8">
		<title>剉冰資料結果</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
	</head>
	<body style="padding: 20px">
		<div class="pure-form">
			<h2>剉冰資料結果</h2>
			<fieldset>
				<legend>ice Result</legend>
				
				你點的主餐 : ${ iceDessert.mainMeal }<p />
				
				你加的配料 :
				<c:forEach var="topping" items="${ iceDessert.toppings }">
					<li>${ topping }</li>
				</c:forEach>
				
				總金額 : ${ iceDessert.price } 元 <p />
				
				</ol>
	
	
				<a href="/JavaWeb/ice" class="pure-button pure-button-primary">返回</a>
			</fieldset>
		</div>
	</body>
</html>