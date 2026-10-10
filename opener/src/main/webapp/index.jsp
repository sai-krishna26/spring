<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.LocalTime" %>
<html lang="en">
<head>
    <title>Home</title>
</head>
<body>
<h3>Hi,</h3>
<%
int hour = LocalTime.now().getHour();
String greeting;
if (hour < 12) {
    greeting = "Good Morning";
} else if (hour < 17) {
    greeting = "Good Afternoon";
} else {
    greeting = "Good Evening";
}
%>
<h3><%= greeting %></h3>

<a href="Wine">Take Wine</a>
</body>
</html>
