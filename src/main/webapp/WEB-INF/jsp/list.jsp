<%--
  Created by IntelliJ IDEA.
  User: Richer
  Date: 2020/9/16
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <table class="table table-hover table-striped">
      <thead>
        <tr>
          <th>用户id</th>
          <th>用户code</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="user" items="${requestScope.get('list')}" varStatus="status">
          <tr>
            <td>${user.id}</td>
            <td>${user.code}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
