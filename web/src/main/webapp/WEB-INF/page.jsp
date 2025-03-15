<%@ page import="com.fasterxml.jackson.databind.ObjectMapper" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    private final ObjectMapper objectMapper = new ObjectMapper();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span><%= request.getAttribute("hello") %></span>
<div>
        <%= objectMapper.writeValueAsString(request.getAttribute("account")) %>
    <div>

</body>
</html>
