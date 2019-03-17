package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair <E extends Comparable> {
    E element;
    E element2;

    public Pair(E firstVal, E secondVal) {
        element = firstVal;
        element2 = secondVal;
    }

    public E min(){
        int compareVal = element.compareTo(element2);

        if(compareVal == -1){
            return element;
        } else {
            return element2;
        }
    }

    public E max(){
        int compareVal = element.compareTo(element2);

        if(compareVal == 1){
            return element;
        }else{
            return element2;
        }
    }

    public E getFirst(){
        return element;
    }

    public E getSecond(){
        return element2;
    }

}
