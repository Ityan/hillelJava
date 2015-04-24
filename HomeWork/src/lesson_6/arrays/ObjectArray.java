package lesson_6.arrays;

import java.util.Arrays;

/**
 * @author ITyan on 17.04.2015.
 */
public class ObjectArray implements ItsArray {

    private Object[] array = new String[1];

    private int counter = 0;

    @Override
    public void add(Object value) {
        if (array.length == counter) {
            resize();
        }
        array[counter] = value;
        counter++;
    }

    @Override
    public void add(int index, Object value) {
        Object[] tmp = new Object[counter + 1];
        for (int i = 0; i < size(); i++) {
            if (i < index) {
                tmp[i] = array[i];
            } else {
                tmp[i + 1] = array[i];
            }
        }
        tmp[index] = value;
        array = tmp;
        counter++;
    }

    @Override
    public Object get(int index) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + counter);
        }
        return array[index];
    }

    @Override
    public Object remove(int index) {
        Object returnValue = array[index];

        for (int i = index; i < size(); i++) {
            array[i] = array[i + 1];
        }
        counter--;
        return returnValue;
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ObjectArray)) {
            return false;
        }
        ObjectArray other = (ObjectArray) obj;

        if (this.size() != other.size()) {
            return false;
        }

        for (int i = 0; i < size(); i++) {
            if (!(this.get(i).equals(other.get(i)))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size(); i++) {
            result += get(i);
            if (i + 1 < size()) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
