package org.example.P22Command.drawer;

import org.example.P22Command.command.Command;

import java.awt.*;

public class DrawCommand implements Command {

    // 绘制对象
    protected Drawable drawable;

    // 绘制位置
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }

    @Override
    public String toString() {
        return "DrawCommand{" +
                "position=" + position +
                '}';
    }
}
