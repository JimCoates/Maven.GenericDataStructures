package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object [0];
    }

    public boolean isEmpty() {
        return elements.length < 1;
    }

    public void push(E foobar) {
        this.elements = Arrays.copyOf(elements,elements.length+1);
        elements[elements.length-1] = foobar;
    }

    public E pop() {
        E temp = elements[elements.length-1];
        elements = Arrays.copyOf(elements,elements.length-1);
        return temp;
    }
}
