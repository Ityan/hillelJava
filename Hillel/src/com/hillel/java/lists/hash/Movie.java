package com.hillel.java.lists.hash;

/**
 * @author ITyan on 13.05.2015.
 */
public class Movie {

    private int year;
    private String name;

    public Movie(int year, String name) {
        this.year = year;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (year != movie.year) return false;
        return name.equals(movie.name);

    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
