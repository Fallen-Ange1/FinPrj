<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create client page</title>
</head>
<body>

<form name="client" action="/updateClient" method="post">
    <p>Id</p>
    <input title="ClientID" type="text" name="id" value="${client.id}">
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${client.name}">
    <p>Email</p>
    <input title="mail" type="text" name="mail" value="${client.mail}">
    <p>Age</p>
    <input title="password" type="text" name="password" value="${client.age}">
    <input type="submit" value="OK">
</form>

</body>
</html>