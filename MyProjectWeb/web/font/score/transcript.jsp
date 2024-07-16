<%-- 
    Document   : transcript
    Created on : Jul 17, 2024, 3:02:04 AM
    Author     : thangPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transcript</title>
    </head>
    <body>
        <h1>Transcript</h1>
    <table border="1">
        <tr>
            <th>Course</th>
            <th>Grade</th>
        </tr>
        <c:forEach var="grade" items="${grades}">
            <tr>
                <td>${grade.courseId}</td>
                <td>${grade.grade}</td>
            </tr>
        </c:forEach>
    </table>
    </body>
</html>
