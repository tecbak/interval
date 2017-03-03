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
        final BoundaryPredicate lowBoundary = boundary.getLowBoundary();
        final BoundaryPredicate highBoundary = boundary.getHighBoundary();
        return list.stream().
                filter((number) -> lowBoundary.test(number, min)).
                filter((number) -> highBoundary.test(number, max)).
                collect(toList());
    }
}
