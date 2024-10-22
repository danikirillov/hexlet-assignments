package exercise;

// BEGIN
public final class ReversedSequence implements CharSequence {
    private final CharSequence original;

    public ReversedSequence(CharSequence original) {
        this.original = original;
    }

    public int length() {
        return original.length();
    }

    public char charAt(int index) {
        return original.charAt(original.length() - index - 1);
    }

    public CharSequence subSequence(int start, int end) {
        int originalEnd = original.length() - start;
        int originalStart = original.length() - end;
        return new ReversedSequence(original.subSequence(originalStart, originalEnd));
    }

    public String toString() {
        return new StringBuilder(this).toString();
    }
}
// END
