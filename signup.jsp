<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="insert" modelAttribute="data">
Email:<form:input path="email"/><br>
Name:<form:input path="name"/><br>
Number:<form:input path="number"/><br>
<form:button>submit</form:button>
<<form:button>cancel</form:button>
</form:form>
</body>
</html>