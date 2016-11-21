import java.util.Collection;
import java.util.Iterator;

public class Multiset<E> implements Collection<E> {
    private E[] array;
    
    public Multiset() {
        array = (E[]) new Object[0];
    }
    
    public Multiset(E[] array) {
        this.array = (E[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
    }
    
    public Multiset(Collection<? extends E> c) {
        array = (E[]) new Object[c.size()];
        int index = 0;
        for (E e : c) {
            array[index] = e;
            index++;
        }
    }
    
    public boolean add(E e) {
        increaseArraySize();
        array[array.length-1] = e;
        return true;
    }
    
    public boolean addAll(Collection<? extends E> c) {
        int index = array.length;
        increaseArraySize(c.size());
        for (E e : c) {
            array[index] = e;
            index++;
        }
        return true;
    }
    
    public void clear() {
        @SuppressWarnings("Unchecked")
        E[] temp = (E[]) new Object[1];
        array = temp;
    }
    
    public boolean contains(Object o) {
        for (E e : array) {
            if (e.equals(o)) return true;
        }
        return false;
    }
    
    public boolean containsAll(Collection<?> c) {
        boolean isIn = true;
        for (Object o : c) {
            boolean found = false;
            E e1 = (E) o;
            for (E e2 : array) {
                if (e2.equals(e1)) found = true;
            }
            isIn = found && isIn;
        }
        return isIn;
        
    }
    
    public boolean equals(Object o) {
        Multiset<E> set;
        try {
            set = (Multiset<E>) o;
        } catch (ClassCastException e) {
            return false;
        }
        for (E e : set) {
            if (multiplicity(e) != set.multiplicity(e)) return false;
        }
        return true;
    }
    
    public int hashCode() {
        int hash = 0;
        for (E e : array) {
            hash += 37 * e.hashCode();
        }
        return hash;
    }
    
    public boolean isEmpty() {
        return array.length == 0;
    }
    
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(array);
    }
    
    public boolean remove(Object o) {
        E e = (E) o;
        int index = -1;
        for (int i =0; i < array.length; i++) {
            if (e.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index < 0) return false;
        for (int j = index; j < array.length-1; j++) {
            array[j] = array[j+1];
        }
        decreaseArraySize();
        return true;
    }
    
    public boolean removeAll(Collection<?> c) {
        for (Object e : c) {
            E e1 = (E) e;
            remove(e1);
        }
        return true;
    }
    
    public boolean retainAll(Collection<?> c) {
        for (E e : array) {
            if (!c.contains(e)) {
                remove(e);
            }
        }
        return true;
    }
    
    public int size() {
        return array.length;
    }
    
    public Object[] toArray() {
        Object[] temp = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        return temp;
    }
    
    public <T> T[] toArray(T[] a) {
        T[] temp = (T[])new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = (T) array[i];
        }
        return temp;
    }
    
    public Multiset<E> intersection(Multiset<E> set) {
        Multiset<E> intersection = new Multiset<E>();
        for (E e : set) {
            if (!intersection.contains(e) && contains(e)) {
                for (int i = 0; i < Math.min(set.multiplicity(e), multiplicity(e)); i++) {
                    intersection.add(e);
                }
            }
        }
        return intersection;
    }
    
    public Multiset<E> union(Multiset<E> set) {
        Multiset<E> union = new Multiset<E>(set);
        for (E e : array) {
            for (int i = 0; i < multiplicity(e) - set.multiplicity(e); i++) {
                union.add(e);
            }
        }
        return union;
    }
    
    public Multiset<E> difference(Multiset<E> set) {
        Multiset<E> difference = new Multiset<E>();
        for (E e : array) {
            for (int i = 0; i < multiplicity(e) - set.multiplicity(e); i++) {
                difference.add(e);
            }
        }
        return difference;
    }
    
    public int multiplicity(E e) {
        int multiplicity = 0;
        for (E el : array)
            if (e.equals(el)) multiplicity++;
        return multiplicity;
    }
    
    private void increaseArraySize(int a) {
        @SuppressWarnings("Unchecked")
        E[] temp = (E[])new Object[array.length+a];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
    
    private void increaseArraySize() {
        increaseArraySize(1);
    }
    
    private void decreaseArraySize(int a) {
        @SuppressWarnings("Unchecked")
        E[] temp = (E[])new Object[array.length-a];
        for (int i = 0; i < array.length-a; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
    
    private void decreaseArraySize() {
        decreaseArraySize(1);
    }
    
    public String toString() {
        if (isEmpty()) return "[]";
        String str = "[";
        for (E e : array) {
            if (e != null) {
                str += e.toString();
            } else {
                str+="null";
            }
            str += ", ";
        }
        str = str.substring(0, str.length()-2) + "]";
        return str;
    }
}