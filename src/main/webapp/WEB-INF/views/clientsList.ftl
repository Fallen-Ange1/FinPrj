<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Users list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>
<#list clients as clinet>
    <tr>
        <td><a href="/client/${client.id}">${client.id}</a></td>
        <td>${clinet.Name}</td>
        <td>${clinet.mail}</td>
        <td>${clinet.password}</td>
        <td><a href="/delete/${clinet.id}">Delete</a></td>
        <td><a href="/update/${clinet.id}">Update</a></td>
    </tr>
</#list>
</table>

<a href="/addClient">Create client</a>
</body>
</html>