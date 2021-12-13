
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 내장객체의 속성은 데이터의 공유를 위해 사용한다!!!!
	//request.setAttribute("name", "손흥민");
	//session.setAttribute("name", "이강인");
	application.setAttribute("name", "메시");
	
	String[] arr = {"AAA", "BBB", "CCC"};
	request.setAttribute("arr", arr);
	
	List<String> list = new ArrayList<String>();
	list.add("HTML5");
	list.add("CSS3");
	list.add("JAVA");
	request.setAttribute("list", list);
	
	
	
	Map<String, String> map = new HashMap<String, String>();
	map.put("name", "손흥민");
	map.put("team", "토트넘");
	map.put("no", String.valueOf(7));
	request.setAttribute("player", map);
	

	
	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	배열 요소 출력 : ${arr[0]} / ${arr[1]} / ${arr[2]} / ${arr[3]} <br>
	List 요소 출력 : ${list[0]} / ${list[1]} / ${list[2]} / ${list[3]} / ${list[4]} <br>
	Map 요소 출력 : ${player.name} / ${player.team} / ${player.no} / ${player.adderss}
	
	
	<hr>
	
	논리값 : ${true} / ${false} <br>
	숫자(정수 / 실수) : ${100 + 10} / ${3.14 * 10} <br>
	문자열 : ${'손흥민'} / ${"이강인"} <br>
	null : ${param.name == null}
	
		
	
	<hr>
	
	param : ${param.type} / <%= request.getParameter("type") %><br>
	cookie : ${cookie.JSESSIONID.value}	<br>
	header : ${header.host}
	

	<hr>

	<%= request.getContextPath() %> <br>
	<%= ((HttpServletRequest)pageContext.getRequest()).getContextPath()%><br>
	${pageContext.request.contextPath}<br>
	${pageContext.request.requestURL}<br>
	${pageContext.request.requestURI}


	<hr>
	<h3>
		request 영역의 name : 
		<%= request.getAttribute("name") %> / 
		${requestScope.name} / 
		${name}
	</h3>
	<h3>
		session 영역의 name : 
		<%= session.getAttribute("name") %> / 
		${sessionScope.name} / 
		${name}
	</h3>
	<h3>
		application 영역의 name : 
		<%= application.getAttribute("name") %> / 
		${applicationScope.name} / 
		${name}
	</h3>

</body>
</html>