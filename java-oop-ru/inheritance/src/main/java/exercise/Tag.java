package exercise;

import java.util.Map;

// BEGIN
public class Tag {
    protected final String name;
    protected final Map<String, String> attributeNameToValue;

    public Tag(String name, Map<String, String> attributeNameToValue) {
        this.name = name;
        this.attributeNameToValue = attributeNameToValue;
    }

    protected String getAttributesAsString() {
        var sb = new StringBuilder();
        var entries = attributeNameToValue.entrySet();
        for (var entry : entries) {
            sb
                .append(" ")
                .append(entry.getKey())
                .append("=\"")
                .append(entry.getValue())
                .append("\"");
        }
        return sb.toString();
    }
}
// END
