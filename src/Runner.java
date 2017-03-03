import interval.Interval;

import java.util.ArrayList;
import java.util.List;

import static interval.Boundary.*;

public class Runner {
    public static void main(String[] args) {
        Interval interval0 = new Interval(5, 10, BOTH_EXCLUSIVE);
        Interval interval1 = new Interval(5, 10, LOWER_INCLUSIVE);
        Interval interval2 = new Interval(5, 10, HIGHER_INCLUSIVE);
        Interval interval3 = new Interval(5, 10, BOTH_INCLUSIVE);

        List<Double> list = new ArrayList<>();

        for (double i = 0; i < 20; i++) {
            list.add(i);
        }

        interval0.getCalculatedData(list).forEach(System.out::println);
        System.out.println();

        interval1.getCalculatedData(list).forEach(System.out::println);
        System.out.println();

        interval2.getCalculatedData(list).forEach(System.out::println);
        System.out.println();

        interval3.getCalculatedData(list).forEach(System.out::println);


    }
}
