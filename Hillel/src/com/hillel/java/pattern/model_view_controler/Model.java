package com.hillel.java.pattern.model_view_controler;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ITyan on 16.07.2015.
 */
public class Model implements MetaEventListener{
    private int bpm;
    private Sequencer sequencer;

    private List<BpmObserver> bpmObservers = new ArrayList<>();
    private List<BeatObserver> beatObservers = new ArrayList<>();

    public Model() {
        sequencer = createSequencer();
    }

    public void registerObserver(BpmObserver observer) {
        bpmObservers.add(observer);
    }

    public void registerObserver(BeatObserver observer) {
        beatObservers.add(observer);
    }

    private void notifyBpmObservers() {
        for (BpmObserver observer : bpmObservers) {
            observer.bpmChanged();
        }
    }

    private void notifyBeatObserver() {
        for (BeatObserver observer : beatObservers) {
            observer.beat();
        }
    }

    public void setBpm(int bpm) {
        int oldValue = this.bpm;
        this.bpm = bpm;
        sequencer.setTempoInBPM(bpm);
        if (oldValue == 0 && bpm != 0) {
            beatEvent();
        }
        if (bpm == 0) {
            sequencer.stop();
        }

        notifyBpmObservers();
    }

    public int getBpm() {
        return bpm;
    }

    private void beatEvent() {
        sequencer.start();
    }

    @Override
    public void meta(MetaMessage meta) {
        if (meta.getType() == 47) {
            sequencer.setTickPosition(0);
            sequencer.setTempoInBPM(getBpm());
            beatEvent();
        }
    }

    private Sequencer createSequencer() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);

            int[] trackList = {34, 34, 39, 0};

            Sequence sequence = new Sequence(Sequence.PPQ, 4);

            Track track = sequence.createTrack();
            for (int i = 0; i < trackList.length; i++) {
                int key = trackList[i];
                if (key != 0) {
                    track.add(makeEvent(144, 9, key, 100, i));
                    track.add(makeEvent(128, 9, key, 100, i + 1));
                }
            }
            track.add(makeEvent(192, 9, 1, 0, 4));

            sequencer.setSequence(sequence);
            return sequencer;
        } catch (InvalidMidiDataException | MidiUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        ShortMessage a = new ShortMessage();
        try {
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        return event;
    }
}
