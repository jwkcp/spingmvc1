<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
Success!!
<ul>
<%--  <li>id=<%=().getId()%></li>--%>
<%--  <li>username=<%=member.getUsername()%></li>--%>
<%--  <li>age=<%=member.getAge()%></li>--%>
  <li>id=${member.id}</li>
  <li>username=${member.username}</li>
  <li>age=${member.age}</li>

</ul>
<a href="/index.html">메인</a>
</body>
