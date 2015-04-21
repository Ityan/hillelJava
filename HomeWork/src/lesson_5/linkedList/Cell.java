package lesson_5.linkedList;

/**
 * Created by Igor on 21.04.2015.
 */
public class Cell {

    private String value;
    private Cell next;

    public Cell(String value) {
        this.value = value;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getNext() {
        return next;
    }

    public String getValue() {
        return value;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cell)) {
            return false;
        }
        return this.getValue().equals(((Cell) obj).getValue());
    }
}
