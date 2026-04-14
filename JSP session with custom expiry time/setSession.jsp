<%
    String name = request.getParameter("username");
    int minutes = Integer.parseInt(request.getParameter("minutes"));

    session.setAttribute("username", name);
    session.setMaxInactiveInterval(minutes * 60);
%>
<html>
<body>
    <h2>Hello <%= name %> !</h2>
    <p>Session expiry time is set to <%= minutes %> minutes.</p>
    <a href="checkSession.jsp">Click here to check session</a>
</body>
</html>