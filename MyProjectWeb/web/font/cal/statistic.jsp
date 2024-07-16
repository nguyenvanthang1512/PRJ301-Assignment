<%-- 
    Document   : statistic
    Created on : Jul 17, 2024, 3:18:24 AM
    Author     : thangPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Statistics</title>
    </head>
    <body>
        <h1>Statistics</h1>
    <table border="1">
        <tr>
            <th>Course</th>
            <th>Average Grade</th>
        </tr>
        <c:forEach var="entry" items="${avgGrades}">
            <tr>
                <td>${entry.key}</td>
                <td>${entry.value}</td>
            </tr>
        </c:forEach>
    </table>
    </body>
</html>
