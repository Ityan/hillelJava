package com.hillel.java.pattern.model_view_controler;

/**
 * @author ITyan on 16.07.2015.
 */
public class Controller {

    private static final int BPM_STEP = 10;
    private static final int MAX_BPM = 180;
    private Model model;
    private DjPanel view;

    public Controller(Model model) {
        this.model = model;
        view = new DjPanel(this, model);

        model.registerObserver(view); //патерн наблюдатель

        view.decreaseBtnEnabled(false);
    }

    public void increaseBtnPressed() {
        int oldBpm = model.getBpm();
        model.setBpm(oldBpm + BPM_STEP);

        view.decreaseBtnEnabled(true);

        if ((model.getBpm() + BPM_STEP) > MAX_BPM) {
            view.increaseBtnEnabled(false);
        }
    }

    public void decreaseBtnPressed() {
        int oldBpm = model.getBpm();
        model.setBpm(oldBpm - BPM_STEP);

        view.increaseBtnEnabled(true);
        if ((model.getBpm() - BPM_STEP) < 0) {
            view.decreaseBtnEnabled(false);
        }
    }
}
