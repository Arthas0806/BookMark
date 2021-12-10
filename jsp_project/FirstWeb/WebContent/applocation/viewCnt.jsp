<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// application 객체의 속성 값을 가져온다!
    String strcnt = (String)application.getAttribute("cnt");

	int cnt = strcnt == null ? 0: Integer.parseInt(strcnt);
	
	// application 객체의 속성 값 저장!
	application.setAttribute("cnt", String.valueOf(++cnt));
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>방문자 수 <%= cnt %></h1>
</body>
</html>