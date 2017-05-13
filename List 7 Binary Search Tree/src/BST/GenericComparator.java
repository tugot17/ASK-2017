package BST;

import java.util.Comparator;

/**
 * Created by pmazurek on 13.05.2017.
 */
public class GenericComparator <T extends Comparable<T> > implements Comparator <T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
