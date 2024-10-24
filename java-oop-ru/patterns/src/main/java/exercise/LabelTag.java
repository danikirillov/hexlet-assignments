package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private final String value;
    private final TagInterface child;

    public LabelTag(String value, TagInterface child) {
        this.value = value;
        this.child = child;
    }

    @Override
    public String render() {
        return String.format("<label>%s%s</label>", value, child.render());
    }
}
// END
