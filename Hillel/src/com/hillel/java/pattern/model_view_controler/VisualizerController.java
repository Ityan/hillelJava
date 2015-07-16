package com.hillel.java.pattern.model_view_controler;

/**
 * Created by ITyan on 16.07.2015.
 */
public class VisualizerController {

    public VisualizerController(Model model) {
        Visualizer visualizer = new Visualizer();
        model.registerObserver(visualizer);
    }
}
