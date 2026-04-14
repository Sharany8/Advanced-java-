<html>
<head>
<script>
function validateForm() {
    let fields = ["rollno","studentname","sub1","sub2","sub3","sub4","sub5"];
    for (let i = 0; i < fields.length; i++) {
        if (document.forms["resultForm"][fields[i]].value == "") {
            alert("All fields are required");
            return false;
        }
    }
    return true;
}
</script>
</head>
<body>
<form name="resultForm" action="ResultServlet" method="post" onsubmit="return validateForm()">
    Roll No: <input type="text" name="rollno"><br>
    Student Name: <input type="text" name="studentname"><br>
    Sub1: <input type="text" name="sub1"><br>
    Sub2: <input type="text" name="sub2"><br>
    Sub3: <input type="text" name="sub3"><br>
    Sub4: <input type="text" name="sub4"><br>
    Sub5: <input type="text" name="sub5"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>