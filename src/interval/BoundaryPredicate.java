package interval;

import java.util.function.BiPredicate;

public enum BoundaryPredicate implements BiPredicate<Double, Double> {
    LOWER {
        @Override
        public boolean test(final Double d0, final Double d1) {
            return d0.compareTo(d1) < 0;
        }
    },
    LOW_OR_EQUALS {
        @Override
        public boolean test(final Double d0, final Double d1) {
            return d0.compareTo(d1) <= 0;
        }
    },
    HIGHER {
        @Override
        public boolean test(final Double d0, final Double d1) {
            return d0.compareTo(d1) > 0;
        }
    },
    HIGHER_OR_EQUALS {
        @Override
        public boolean test(final Double d0, final Double d1) {
            return d0.compareTo(d1) >= 0;
        }
    }
}
