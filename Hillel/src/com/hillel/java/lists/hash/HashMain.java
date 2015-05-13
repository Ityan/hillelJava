package com.hillel.java.lists.hash;

/**
 * Created by ITyan on 13.05.2015.
 */
public class HashMain {

    public static void main(String[] args) {
        Movie movie1 = new Movie(2000, "Matrix");
        Movie movie2 = new Movie(2000, "Matrix 2");

        System.out.println(movie1.hashCode());
        System.out.println(movie2.hashCode());

        MyHashSet set = new MyHashSet();
        set.add(movie1);
        set.add(movie2);

        System.out.println("movie1 is in " + set.contains(movie1));
        System.out.println("movie2 is in " + set.contains(movie2));
        System.out.println(set);
    }
}
