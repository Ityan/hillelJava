package com.hillel.java.database;

/**
 * Created by Igor on 10.07.2015.
 */
public interface Dao<T> {

    void deleteCurrent();

    void insert(T model);

    void updateCurrent(T model);

    T getPrevious();

    T getNext();

    void close();

}
