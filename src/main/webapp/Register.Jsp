<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body text-alignment="center">
<h4 align="center">Registration form</h4>
<font color="red"><%=request.getAttribute("errormsg")==null ? "" : request.getAttribute("errormsg")%></font>


<form action = "test" method = "post">

Email:<input type="text" name="mail"/><br>
mobile:<input type="text" name="mobile"/><br>
Password:<input type="password" name="password"/><br>
City:<input type="text" name="city"/><br>

<br>
<input type="submit" value="Signup"/>

</form>
</body>

</html>