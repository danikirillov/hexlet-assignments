@import exercise.dto.users.UserPage
@param UserPage page

<main>
    <h1>${page.getUser().getId()}</h1>
    <p>${page.getUser().getFirstName()}</p>
    <p>${page.getUser().getLastName()}</p>
    <p>${page.getUser().getEmail()}</p>
</main>