@import exercise.dto.articles.BuildArticlePage
@param BuildArticlePage page

@template.layout.page(
content = @`
    @if(page.getErrors() != null)
        <ul>
            @for(var validator : page.getErrors().values())
                @for(var error : validator)
                    <li>${error.getMessage()}</li>
                @endfor
            @endfor
        </ul>
    @endif

    <form action="/articles" method="post">
        <div>
            <label>
                Title
                <input type="text" name="title" value="${page.getArticle().getTitle()}" />
            </label>
        </div>
        <div>
            <label>
                Content
                <input type="text" required name="content" value="${page.getArticle().getContent()}" />
            </label>
        </div>
        <input type="submit" value="Post" />
    </form>
`
)
