<html>
<body>
<h2>Student Result</h2>
Roll No: <%= request.getAttribute("rollno") %><br>
Student Name: <%= request.getAttribute("studentname") %><br>
Sub1: <%= request.getAttribute("sub1") %><br>
Sub2: <%= request.getAttribute("sub2") %><br>
Sub3: <%= request.getAttribute("sub3") %><br>
Sub4: <%= request.getAttribute("sub4") %><br>
Sub5: <%= request.getAttribute("sub5") %><br>
Average: <%= request.getAttribute("average") %><br>
Result: <%= request.getAttribute("result") %><br>
<a href="index.jsp">Go back</a>
</body>
</html>