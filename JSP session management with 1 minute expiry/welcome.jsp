<%
    session.setMaxInactiveInterval(60);
    String name = request.getParameter("username");
    session.setAttribute("username", name);
%>
<html>
<body>
    <h2>Hello <%= name %> !</h2>
    <p>Session expires in 1 minute.</p>
    <a href="checkSession.jsp">Check Session</a>
</body>
</html>