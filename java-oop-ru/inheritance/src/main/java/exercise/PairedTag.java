package exercise;

import java.util.List;
import java.util.Map;

// BEGIN
public class PairedTag extends Tag {
    protected final String body;
    protected final List<Tag> children;

    public PairedTag(String name, Map<String, String> attributeNameToValue, String body, List<Tag> children) {
        super(name, attributeNameToValue);
        this.body = body;
        this.children = children;
    }
    
    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (var child : children) {
            sb.append(child.toString());
        }
        var childrenAsString = sb.toString();

        return String.format("<%s%s>%s%s</%s>", name, getAttributesAsString(), body, childrenAsString, name);
    }
}
// END
