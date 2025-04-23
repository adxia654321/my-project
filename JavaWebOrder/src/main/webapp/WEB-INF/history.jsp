<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
    
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="/JavaWebOrder/css/buttons.css">
		<meta charset="UTF-8">
		<title>訂單歷史資料</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
	</head>
	<body style="padding: 20px">
		<div class="pure-form">
			<fieldset>
				<legend>訂單歷史資料</legend>
				<table class="pure-table pure-table-bordered">
					<thead>
						<tr>
							<th>Index</th><th>Item</th><th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach varStatus="row" var="dto" items="${ orderDTOs }">
							<tr>
								<td>${ row.index }</td>
								<td>${ dto.message }</td>
								<td><a href="/JavaWebOrder/order/delete?index=${row.index}" class="button-success pure-button">X</a>
							</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="2" style="text-align: right;background-color: #DDDDDD">總金額</td>
							<td>${ totalPrice }</td>
						</tr>
					</tfoot>
				</table>
				<p />
				<a href="/JavaWebOrder/index.jsp" class="pure-button pure-button-primary">回首頁</a>
			</fieldset>
		</div>
	</body>
</html>