<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <jsp:include page="/layout/css.jsp"/>
</head>
<body>
<h2>Add Student</h2>
<form action="addStudent" method="post">
    <label for="studentCode">Student Code:</label><br>
    <input type="text" id="studentCode" name="studentCode"><br>
    <label for="fullName">Full Name:</label><br>
    <input type="text" id="fullName" name="fullName"><br>
    <label for="address">Address:</label><br>
    <input type="text" id="address" name="address"><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>

