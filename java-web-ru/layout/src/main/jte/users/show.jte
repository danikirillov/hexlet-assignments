@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
content = @`
        <div>
            ${page.getUser().getLastName()} ${page.getUser().getFirstName()}
            ${page.getUser().getEmail()} ${page.getUser().getId()}
        </div>
`
)