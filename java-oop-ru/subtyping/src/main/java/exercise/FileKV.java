package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private final String filePath;

    public FileKV(String filePath, Map<String, String> keyToValue) {
        this.filePath = filePath;
    }

    @Override
    public void set(String key, String value) {
        var currentMap = toMap();
        currentMap.put(key, value);
        Utils.writeFile(filePath, Utils.serialize(currentMap));
    }

    @Override
    public void unset(String key) {
        var currentMap = toMap();
        currentMap.remove(key);
        Utils.writeFile(filePath, Utils.serialize(currentMap));
    }

    @Override
    public String get(String key, String defaultValue) {
        return toMap().getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return Utils.deserialize(Utils.readFile(filePath));
    }
}

// END
