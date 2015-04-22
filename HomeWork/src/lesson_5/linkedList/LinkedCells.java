package lesson_5.linkedList;

/**
 * Created by Igor on 21.04.2015.
 */
public class LinkedCells {

    private Cell head;
    private Cell tail;
    private int counter;

    public void add(String value) {
        Cell next = new Cell(value);
        if (head == null) {
            head = next;
        }
        if (tail != null) {
            tail.setNext(next);
        }
        tail = next;
        counter++;
    }

    public void add(int index, String value) {
        Cell current = new Cell(value);
        Cell tmp;
        if (index == 0) {
            tmp = head;
            tmp.setNext(head.getNext());
            head = current;
            current.setNext(tmp);

        } else if (index == (size() - 1)) {
            add(value);
            counter--;
        } else {
            current.setNext(getCell(index));
            getCell(index - 1).setNext(current);
        }
        counter++;
    }

    public String remove(int index) {
        String removedElement = getCellValue(index);
        if (index == 0) {
            head = head.getNext();
        }
        else {
            getCell(index - 1).setNext(getCell(index + 1));
        }
        counter--;
        return removedElement;
    }

    public String getCellValue(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException
                    ("size: " + size() +", index: " + index);
        }
        Cell current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        return current.getValue();
    }

    public Cell getCell(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException
                    ("size: " + size() +", index: " + index);
        }
        Cell current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        return current;
    }

    public int size() {
        return counter;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        String result = "[";
        Cell current = head;
        while (current != null) {
            result += current.getValue();
            if (current.getNext() != null) {
                result += ", ";
            }
            current = current.getNext();
        }
        result += "]";
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedCells)) {
            return false;
        }
        LinkedCells other = (LinkedCells) obj;
        if (this.isEmpty() && other.isEmpty()) {
            return true;
        }
        if (this.size() != other.size()) {
            return false;
        }

        Cell thisCurrent = this.head;
        Cell otherCurrent = other.head;
        while (thisCurrent != null) {
            if (!thisCurrent.equals(otherCurrent)) {
                return false;
            }
            thisCurrent = thisCurrent.getNext();
            otherCurrent = otherCurrent.getNext();
        }
        return true;
    }
}
