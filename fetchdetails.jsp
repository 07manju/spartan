<%@ page import="mock.Dto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Dto dto=(Dto)request.getAttribute("fetchdata2");
%>
<%=dto.getEmail()%>
<%=dto.getName() %>
<%=dto.getNumber()%>


</body>
</html>
