package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private final Map<String, String> keyToValue;

    public InMemoryKV(Map<String, String> keyToValue) {
        this.keyToValue = new HashMap<>(keyToValue);
    }

    @Override
    public void set(String key, String value) {
        keyToValue.put(key, value);
    }

    @Override
    public void unset(String key) {
        keyToValue.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return keyToValue.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(keyToValue);
    }
}
// END
