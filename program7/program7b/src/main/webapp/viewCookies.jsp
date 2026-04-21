<%@ page import="javax.servlet.http.Cookie" %>
<html>
<body>

<h2>Active Cookies List</h2>

<%
    Cookie[] cookies = request.getCookies();

    if(cookies != null){
        for(Cookie c : cookies){
%>
            <p>
                Name: <%= c.getName() %> <br>
                Value: <%= c.getValue() %> <br><br>
            </p>
<%
        }
    } else {
%>
    <p>No Cookies Found</p>
<%
    }
%>

</body>
</html>