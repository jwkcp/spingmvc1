<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  MemberRepository memberRepository = MemberRepository.getInstance();

  System.out.println("MemberSaveServlet.service");
  String username = request.getParameter("username");
  String age = request.getParameter("age");

  Member member = new Member(username, Integer.parseInt(age));

  Member savedMember = memberRepository.save(member);
  System.out.println("savedMember = " + savedMember);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
  Success!!
  <ul>
    <li>id=<%=member.getId()%></li>
    <li>username=<%=member.getUsername()%></li>
    <li>age=<%=member.getAge()%></li>
  </ul>
  <a href="/">메인</a>
</body>
</html>
