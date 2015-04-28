package lesson_7.iteratorList.linkedCells;

import java.util.Iterator;

/**
 * Created by Igor on 28.04.2015.
 */
public class LinkedCellsIterator implements Iterator {

    private LinkedCells linkedCells;
    private int nextIndex;

    public LinkedCellsIterator(LinkedCells linkedCells) {
        this.linkedCells = linkedCells;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < linkedCells.size();
    }

    @Override
    public Object next() {
        Object next = linkedCells.get(nextIndex);
        nextIndex++;
        return next;
    }

    @Override
    public void remove() {
      linkedCells.remove(nextIndex);
    }
}
