package exercise.dto.articles;

import exercise.model.Article;
import io.javalin.validation.ValidationError;
import java.util.Map;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;

// BEGIN
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BuildArticlePage {
    private Article article;
    private Map<String, List<ValidationError<Object>>> errors;
}
// END
