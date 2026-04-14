<%
    String name = (String) session.getAttribute("username");
    if (name != null) {
%>
    <h2>Session Active. Hello <%= name %></h2>
<%
    } else {
%>
    <h2>Session Expired.</h2>
<%
    }
%>