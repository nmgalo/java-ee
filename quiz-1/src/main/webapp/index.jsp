<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Submit your application</title>
</head>
<body>
<div style="text-align: center;">
    <h1> შინაური ცხოველების სარეგისტრაცია ფორმა</h1>
    <form action="submit-application" method="post">
        <div>
            <label for="name">სახელი</label>
            <input type="text" name="name" id="name">
        </div>
        <div>
            <label for="race">ჯიში</label>
            <input type="text" name="race" id="race">
        </div>
        <div>
            <label for="gender">სქესი</label>
            <select name="gender" id="gender">
                <option value="male">male</option>
                <option value="female">female</option>
            </select>
        </div>
        <div>
            <label for="age">ასაკი</label>
            <input type="number" id="age" name="age">
        </div>
        <div>
            <button name="submit">რეგისტრაცია</button>
        </div>
    </form>
</div>
</body>
</html>