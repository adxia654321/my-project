<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<html>
	<head>
		<meta charset="UTF-8">
		<title>留言板資料結果</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
	</head>
	<body style="padding: 20px">
		<div class="pure-form">
			<h2>留言板資料結果</h2>
			<fieldset>
				<legend>Guestbook Result</legend>
				本次留言: ${ message }<p />
				歷史留言: ${ guestbooks }<p />
				<ol>
				<c:forEach var="gb" items="${ guestbooks }">
					<li>${ gb.message } ${ gb.date }</li>
				</c:forEach>
				</ol>
				<p />
				<table class="pure-table pure-table-bordered">
					<thead>
						<tr>
							<th>No</th>
							<th>留言內容</th>
							<th>留言時間</th>
						</tr>						
					</thead>
					<tbody>
						<c:forEach varStatus="i" var="gb" items="${guestbooks }">
							<tr>
								<td>${ i.index + 1 }</td>
								<td>${ gb.message }</td>
								<!-- 格式化日期 -->
								<td>
									<fmt:formatDate value="${gb.date }" pattern="yyyy-MM-dd" a hh:mm:ss E"/>
								</td>
							</tr>
						</c:forEach>
					</tbody>
					
				</table>
				
				<a href="/JavaWeb/guestbook" class="pure-button pure-button-primary">返回</a>
			</fieldset>
		</div>
	</body>
</html>