<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    int age = Integer.parseInt(request.getParameter("age"));

    Cookie cookie = new Cookie(name, domain);
    cookie.setMaxAge(age);
    response.addCookie(cookie);
%>
<html>
<body>
    <h2>Cookie Added Successfully</h2>
    <p>Name: <%= name %></p>
    <p>Domain/Value: <%= domain %></p>
    <p>Expiry Age: <%= age %></p>
    <a href="showCookies.jsp">Go to Active Cookie List</a>
</body>
</html>