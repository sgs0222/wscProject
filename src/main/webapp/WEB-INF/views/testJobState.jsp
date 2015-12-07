<%--
  Created by IntelliJ IDEA.
  User: hyemi
  Date: 2015-12-06
  Time: 오후 7:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Job State</title>
</head>
<body>
<h2>Job state</h2>
<c:forEach var="jobitem" items="${jobsList}">
  <br/>${jobitem.keyword} <br/>
  ${jobitem.company}
  <br/> ${jobitem.salary}<br/>
</c:forEach>
<br>

</body>
</html>
