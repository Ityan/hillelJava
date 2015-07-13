package com.hillel.java.pattern.factory;

/**
 * Created by ITyan on 13.07.2015.
 */
public class Pizza {

    private Dough dough;
    private Cheese cheese;
    private Seafood seafood;

    private String name;

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setSeafood(Seafood seafood) {
        this.seafood = seafood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("preparing pizza");
    }

    public void bake() {
        System.out.println("pizza is baking");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", cheese=" + cheese +
                ", seafood=" + seafood +
                ", name='" + name + '\'' +
                '}';
    }
}
