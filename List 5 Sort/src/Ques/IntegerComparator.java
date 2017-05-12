package Ques;

import java.util.Comparator;

/**
 * Created by pmazurek on 12.05.2017.
 */
public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
