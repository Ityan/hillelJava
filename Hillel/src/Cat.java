import java.util.Arrays;
import java.util.Objects;

/**
 * Created by ITyan on 10.04.2015.
 */
public class Cat {
    String name;
    int age;
    String[] vaccines = new String[10];
    int vaccineCount = 0;

    public Cat() {

    }

    public Cat(String name) {
        this(name, 0);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        String result = "Cat ";
        result += name;
        result += age;
        result += Arrays.toString(vaccines);
        return result;
    }

    public void acceptVaccine(String vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
    }

    public static int mawCount() {
        Cat cat = new Cat();
        cat.acceptVaccine("afg");
        return 4;
    }

    public boolean equals(Object other) {
        if (other instanceof Cat) {
            Cat otherCat = (Cat) other;
            if (this.age != otherCat.age) {
                return false;
            }
            if (!this.name.equals(otherCat.name)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
