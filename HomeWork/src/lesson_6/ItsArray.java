package lesson_6;

/**
 * @author ITyan on 23.04.2015.
 */
public interface ItsArray {

    abstract void add(Object value);

    abstract void add(int index ,Object value);

    abstract Object get(int index);

    abstract Object remove(int index);

    abstract int size();
}
