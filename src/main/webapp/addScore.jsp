<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Score</title>
    <jsp:include page="/layout/css.jsp"/>
</head>
<body>
<h2>Add Score</h2>
<form action="addScore" method="post">
    <label for="studentId">Student ID:</label><br>
    <input type="text" id="studentId" name="studentId"><br>
    <label for="subjectId">Subject ID:</label><br>
    <input type="text" id="subjectId" name="subjectId"><br>
    <label for="score1">Score 1:</label><br>
    <input type="text" id="score1" name="score1"><br>
    <label for="score2">Score 2:</label><br>
    <input type="text" id="score2" name="score2"><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>

