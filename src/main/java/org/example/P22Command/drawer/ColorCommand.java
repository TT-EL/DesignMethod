package org.example.P22Command.drawer;

import org.example.P22Command.command.Command;

import java.awt.*;

public class ColorCommand implements Command {

    private Drawable drawable;

    private Color color;

    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    /**
     * 颜色改变类的执行动作就是<strong>改变颜色</strong>
     */
    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
