<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	This is HTMl only...
	<!--This is a scriptlet-->
	<!-- %= is called as expression used to display on browser ,no ; needed we want to display somehthing-->
	<br>
	<%
		List<String> names =(List)session.getAttribute("data");
		out.println(names);
	%>
	Size = <%= session.getAttribute("size") %>
	<br>
	<%= new Date() %>
</body>
</html>