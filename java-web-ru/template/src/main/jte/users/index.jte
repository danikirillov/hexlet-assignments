@import exercise.dto.users.UsersPage
@param UsersPage page

<html>
<head>
    <title>Хекслет</title>
</head>
<body>
@if(page.getUsers().isEmpty())
    <p>No users found</p>
@else
    @for(var user : page.getUsers())
        <div>
            <h2><a href="/users/${user.getId()}">${user.getEmail()}</a></h2>
            <p>${user.getFirstName()} ${user.getLastName()}</p>
        </div>
    @endfor
@endif
</body>
</html>