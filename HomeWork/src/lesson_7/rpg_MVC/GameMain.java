package lesson_7.rpg_MVC;

/**
 * @author ITyan on 22.07.2015.
 */
public class GameMain {
    public static void main(String[] args) {
        Model model = new Model();
        new Controller(model);
    }
}
