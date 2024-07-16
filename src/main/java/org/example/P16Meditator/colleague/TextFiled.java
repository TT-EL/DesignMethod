package org.example.P16Meditator.colleague;

import org.example.P16Meditator.Colleague;
import org.example.P16Meditator.Mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextFiled extends TextField implements TextListener,Colleague {

    private Mediator mediator;

    public TextFiled(String text, int columns) throws HeadlessException {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
        setBackground(enable ? Color.white: Color.lightGray);
    }

    public void textValueChanged(TextEvent event) {
        mediator.colleagueChanged();
    }
}
