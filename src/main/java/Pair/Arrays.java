package Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {

    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {
        Pair <E> pair = new Pair<>(a.get(0), a.get(a.size()-1));
        return pair;
    }

    public static Integer max(ArrayList<Integer> al) {
        Integer max = al.stream()
                .mapToInt(value -> value)
                .max()
                .orElseThrow(NoSuchElementException::new);
        return max;
    }

    public static Pair<Integer> minMax(ArrayList<Integer> al) {
        Pair pair = new Pair(min(al),max(al));
        return pair;
    }

    public static Integer min(ArrayList<Integer> al) {
        Integer min = al.stream()
                .mapToInt(value -> value)
                .min()
                .orElseThrow(NoSuchElementException::new);
        return min;
    }
}
