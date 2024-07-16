package org.example.P22Command.drawer;

import java.awt.*;

/**
 * 表示绘制对象
 */
public interface Drawable {
    /**
     * 用于绘制的方法
     * @param x 水平坐标
     * @param y 垂直坐标
     */
    public abstract void draw(int x, int y);

    /**
     * 习题21-1：增加修改颜色的方法
     * @param color
     */
    public abstract void setColor(Color color);
}
