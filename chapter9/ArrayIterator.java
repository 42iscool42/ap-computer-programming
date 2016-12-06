import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E>{
    private E[] array;
    private int index;
    
    public ArrayIterator(E[] array) {
        index = 0;
        this.array = array;
    }
    
    public boolean hasNext() {
        return index < array.length;
    }
    
    public E next() {
        E next = array[index];
        index++;
        return next;
    }
    
    public void remove(E e) {
        throw new UnsupportedOperationException();
    }
}