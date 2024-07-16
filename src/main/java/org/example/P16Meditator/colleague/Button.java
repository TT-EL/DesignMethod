package org.example.P16Meditator.colleague;

import org.example.P16Meditator.Colleague;
import org.example.P16Meditator.Mediator;

import java.awt.*;

/**
 * Button 继承了java.awt.Button并实现了自定义的Colleague接口
 */
public class Button extends java.awt.Button implements Colleague {

    private Mediator mediator;

    public Button(String label) throws HeadlessException {
        super(label);
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
