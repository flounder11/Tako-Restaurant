<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form:form method="POST" modelAttribute="userForm">
    <h2>Регистрация</h2>
    <div>
        <form:input type="text" path="username" placeholder="Username"
                    autofocus="true"></form:input>
        <form:errors path="username"></form:errors>
            ${usernameError}
    </div>
    <div>
        <form:input type="password" path="password" placeholder="Password"></form:input>
    </div>
    <div>
        <form:input type="password" path="passwordConfirm"
                    placeholder="Confirm your password"></form:input>
        <form:errors path="password"></form:errors>
            ${passwordError}
    </div>
    <button type="submit">Зарегистрироваться</button>
</form:form>
<a href="/">Главная</a>
</body>
</html>