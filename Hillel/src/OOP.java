/**
 * Created by ITyan on 10.04.2015.
 */
public class OOP {

    public static void main(String[] args) {
        //oopIntro();

        Cat cat1 = new Cat("Tom", 2);
        Cat cat2 = cat1;
        System.out.println(cat1 == cat2);

        cat2 = new Cat("Tom", 2);

        System.out.println(cat1.equals(cat2));

        oopIntro();
    }

    public static void oopIntro() {
        Cat cat1 = new Cat("Tom", 2);

        Cat cat2 = new Cat("Jon", 1);

        Vet vet = new Vet();

        vet.registerCat(cat1);
        vet.registerCat(cat2);
        vet.print();

        vet.makeVaccine();
        vet.print();

        System.out.println();
    }

}
