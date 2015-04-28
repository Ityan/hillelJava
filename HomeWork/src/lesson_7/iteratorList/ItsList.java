package lesson_7.iteratorList;

/**
 * @author ITyan on 23.04.2015.
 */
public interface ItsList {

    void add(Object value);

    void add(int index, Object value);

    Object get(int index);

    Object remove(int index);

    int size();
}
