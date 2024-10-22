package exercise;

import java.util.List;

// BEGIN
public final class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int amount) {
        return
            apartments
                .stream()
                .sorted()
                .limit(amount)
                .map(Home::toString)
                .toList();
    }
}
// END
