package interval;

import static interval.BoundaryPredicate.*;

public enum Boundary {
    BOTH_INCLUSIVE(HIGHER_OR_EQUALS, LOW_OR_EQUALS),
    LOWER_INCLUSIVE(HIGHER_OR_EQUALS, LOWER),
    HIGHER_INCLUSIVE(HIGHER, LOW_OR_EQUALS),
    BOTH_EXCLUSIVE(HIGHER, LOWER);

    private final BoundaryPredicate lowBoundary;
    private final BoundaryPredicate highBoundary;

    Boundary(final BoundaryPredicate lowPredicate, final BoundaryPredicate highPredicate) {
        this.lowBoundary = lowPredicate;
        this.highBoundary = highPredicate;
    }

    public BoundaryPredicate getLowBoundary() {
        return lowBoundary;
    }

    public BoundaryPredicate getHighBoundary() {
        return highBoundary;
    }
}
