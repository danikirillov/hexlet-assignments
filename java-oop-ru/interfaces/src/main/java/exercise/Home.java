package exercise;

import java.util.Comparator;

// BEGIN
public interface Home extends Comparable<Home> {
    double getArea();

    @Override
    default int compareTo(Home other) {
        return Comparator.comparingDouble(Home::getArea).compare(this, other);
    }
}
// END
