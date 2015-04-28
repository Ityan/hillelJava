package lesson_7.iteratorList.linkedCells;

/**
 * Created by Igor on 21.04.2015.
 */
public class Cell {

    private Object value;
    private Cell next;

    public Cell(Object value) {
        this.value = value;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getNext() {
       return next;
    }

    public Object getValue() {
        return value;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cell)) {
            return false;
        }
        return this.getValue().equals(((Cell) obj).getValue());
    }
}
