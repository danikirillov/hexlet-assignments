package exercise;

import java.util.HashMap;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        var keyToValue = storage.toMap();
        var valueToKey = new HashMap<String, String>();
        
        var keyToValueEntries = keyToValue.entrySet();
        for (var entry : keyToValueEntries) {
            valueToKey.put(entry.getValue(), entry.getKey());
        }

        for (var entry : keyToValueEntries) {
            storage.unset(entry.getKey());
        }

        var valueToKeyEntries = valueToKey.entrySet();
        for (var entry : valueToKeyEntries) {
            storage.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
