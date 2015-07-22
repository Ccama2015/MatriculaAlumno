<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="unsa.edu.*" %>
<%@ page import="java.util.List"%>
<%@ page import="javax.sevlet.http.*;" %>

<% List<Curso> lista = (List<Curso>) request.getAttribute("lista");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="matricularse" method="post">
<%for(Curso c: lista){ %>
	<input type="checkbox" name="" value="<%out.print(c.getNomcurso());%>"/>
	<%out.print(c.getNomcurso());%><br>
<%}%>
<input type="submit" value="MATRICULARSE">
</form>
</body>
</html>