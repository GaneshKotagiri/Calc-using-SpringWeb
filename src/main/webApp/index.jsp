<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Calculator</h1>
<form action="calc" method="get">
    <label for="num1">Enter first number:</label>
    <input type="number" id="num1" name="num1" required>
    <br><br>
    <label for="num2">Enter second number:</label>
    <input type="number" id="num2" name="num2" required>
    <br><br>
    <button type="submit" name="operation" value="add">Add</button>
    <button type="submit" name="operation" value="subs">Sub</button>
    <br><br>
    <button type="submit" name="operation" value="mul">Mul</button>
    <button type="submit" name="operation" value="div">Div</button>
</form>
</body>
</html>
