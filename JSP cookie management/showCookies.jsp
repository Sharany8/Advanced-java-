<%@ page import="jakarta.servlet.http.Cookie" %>
<html>
<body>
<h2>Active Cookies</h2>
<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            out.println("Name: " + c.getName() + ", Value: " + c.getValue() + "<br>");
        }
    } else {
        out.println("No active cookies found.");
    }
%>
</body>
</html>