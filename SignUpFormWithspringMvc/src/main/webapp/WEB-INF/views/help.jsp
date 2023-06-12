<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page isELIgnored="false" %>
<!-- jstl uri seach  orcal ko click krna gogal standard syntax lana    -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>
<%
    /*  String name=(String)request.getAttribute("name");
      Integer rollnumber=(Integer)request.getAttribute("rollnumber");
      LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
       
%>
   
       <h1>Hello my name is
      <%--  <%=name %> --%>
      ${name}
       </h1>
       <h1>
       my roll no is
    <%--    <%=rollnumber %>  --%>
    ${rollnumber}
       </h1>
       <h1>
         Date And Time is
        <%--  <%time.toString() %> --%>
        ${time}
       </h1>
       <hr>
   <%--     ${marks} --%>
        <c:forEach var="item" items="${marks}">
       <%--  <h1>${item}</h1> --%>
      <h1> <c:out value="${item}"></c:out></h1>
        
        </c:forEach>


<h1>hello, my name is sanju</h1>
<h1>This is help page</h1>

</body>
</html>