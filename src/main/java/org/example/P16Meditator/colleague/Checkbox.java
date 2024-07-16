package org.example.P16Meditator.colleague;

import org.example.P16Meditator.Colleague;
import org.example.P16Meditator.Mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkbox extends java.awt.Checkbox implements ItemListener, Colleague {

    private Mediator mediator;

    public Checkbox(String label, CheckboxGroup group, boolean state) throws HeadlessException {
        super(label, group, state);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
    }
}
