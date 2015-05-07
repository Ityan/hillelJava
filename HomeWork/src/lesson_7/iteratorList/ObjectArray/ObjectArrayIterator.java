package lesson_7.iteratorList.objectArray;

import lesson_5.StringArray;

import java.util.Iterator;

/**
 * Created by Igor on 28.04.2015.
 */
public class ObjectArrayIterator implements Iterator {

    private ObjectArray objectArray;
    private int nextIndex;

    public ObjectArrayIterator(ObjectArray objectArray) {
        this.objectArray = objectArray;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < objectArray.size();
    }

    @Override
    public Object next() {
        Object next = objectArray.get(nextIndex);
        nextIndex++;
        return next;
    }

    @Override
    public void remove() {
        objectArray.remove(nextIndex);
    }
}
