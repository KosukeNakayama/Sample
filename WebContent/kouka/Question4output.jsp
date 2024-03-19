<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question4出力画面</title>
</head>
<body>
<h1>Question4</h1>
<p>入力されたお名前は・・・<br>
<%= request.getParameter("name") %><br>
ですね！
</p>
</body>
</html>