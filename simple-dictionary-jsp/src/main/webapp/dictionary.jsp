<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/23/2023
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
  Map<String, String> dic = new HashMap<>();
%>
<%
  dic.put("Banana", "Chui'");
  dic.put("Orange", "Cam");
  dic.put("Apple", "Tao'");
  dic.put("Mango", "Xoai'");
  dic.put("Tomato", "Ca Chua'");
  dic.put("Fe", "Sat'");
  String search = request.getParameter("search");
  String result = dic.get(search);
  PrintWriter writer = response.getWriter();
  if (result != null) {
    writer.println("Word: " + search);
    writer.println("Result: " + result);
  } else {
    writer.println("Not found");
  }
%>
</body>
</html>
