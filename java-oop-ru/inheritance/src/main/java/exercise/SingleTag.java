package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributeNameToValue) {
        super(name, attributeNameToValue);
    }

    @Override
    public String toString() {
        return String.format("<%s%s>", name, getAttributesAsString());
    }
}
// END
