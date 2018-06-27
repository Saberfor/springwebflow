<%--
  Created by IntelliJ IDEA.
  User: GeXiancheng
  Date: 2018/6/26
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="item">
        ${item.id},${item.name},${item.classNo},${item.sex}
    </c:forEach>
</body>
</html>
