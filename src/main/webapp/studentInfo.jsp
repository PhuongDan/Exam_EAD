<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Information</title>
    <jsp:include page="/layout/css.jsp"/>
</head>
<body>
<h2>Student Information</h2>
<table>
    <tr>
        <th>Student Code</th>
        <th>Full Name</th>
        <th>Address</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.studentCode}</td>
            <td>${student.fullName}</td>
            <td>${student.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

