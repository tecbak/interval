package interval;

import java.util.List;

import static java.util.stream.Collectors.*;

public class Interval {
    private final double min;
    private final double max;
    private final Boundary boundary;

    public Interval(final double min, final double max, final Boundary boundary) {
        this.min = min;
        this.max = max;
        this.boundary = boundary;
    }

    public List<Double> getCalculatedData(final List<Double> list) {
        return list.stream().
                filter((number) -> boundary.testLowBoundary(number, min)).
                filter((number) -> boundary.testHighBoundary(number, max)).
                collect(toList());
    }
}
