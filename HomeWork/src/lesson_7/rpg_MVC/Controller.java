package lesson_7.rpg_MVC;

/**
 * @author ITyan on 22.07.2015.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model) {
        this.model = model;
        view = new View(this, model);

        model.registerObserver(view);

        view.secondBtnEnabled(false);
    }

    public void btn1Pressed() {
        model.player1Attack();
        view.firstBtnEnabled(false);
        view.secondBtnEnabled(true);
    }

    public void btn2Pressed() {
        model.player2Attack();
        view.firstBtnEnabled(true);
        view.secondBtnEnabled(false);
    }

    public void checkGameOver() {
        model.gameOver();
    }
}
