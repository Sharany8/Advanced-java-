<html>
<head>
<script>
function validateForm() {
    let username = document.forms["userForm"]["username"].value;
    let email = document.forms["userForm"]["email"].value;
    let designation = document.forms["userForm"]["designation"].value;

    if (username == "" || email == "" || designation == "") {
        alert("All fields are required");
        return false;
    }
    if (!email.includes("@")) {
        alert("Invalid email");
        return false;
    }
    return true;
}
</script>
</head>
<body>
<form name="userForm" action="UserDataServlet" method="post" onsubmit="return validateForm()">
    Username: <input type="text" name="username"><br>
    Email: <input type="text" name="email"><br>
    Designation: <input type="text" name="designation"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>