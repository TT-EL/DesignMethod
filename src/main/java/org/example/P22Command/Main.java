package org.example.P22Command;

import org.example.P22Command.command.Command;
import org.example.P22Command.command.MacroCommand;
import org.example.P22Command.drawer.ColorCommand;
import org.example.P22Command.drawer.DrawCanvas;
import org.example.P22Command.drawer.DrawCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new Main("Command Sample");
    }

    // 绘制的历史记录
    private MacroCommand history = new MacroCommand();

    // 绘制区域
    private DrawCanvas canvas = new DrawCanvas(400, 400, history); // 这里的history是和main共享的

    // 删除按钮
    private JButton clearButton = new JButton("Clear");

    // 习题21-1增加颜色
    private JButton colorRedButton = new JButton("Red");
    private JButton colorBlueButton = new JButton("Blue");
    private JButton colorOrangeButton = new JButton("Orange");

    private JButton undoButton = new JButton("Undo");

    public Main(String title) throws HeadlessException {
        super(title);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // 匿名内部类与适配器结合
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Command command = new DrawCommand(canvas, e.getPoint());
                history.append(command);
                command.execute(); // 立即生效
            }
        });
        clearButton.addActionListener(this);
        colorRedButton.addActionListener(this);
        colorBlueButton.addActionListener(this);
        colorOrangeButton.addActionListener(this);
        undoButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(colorRedButton);
        buttonBox.add(colorBlueButton);
        buttonBox.add(colorOrangeButton);
        buttonBox.add(undoButton);

        Box main = new Box(BoxLayout.Y_AXIS);
        main.add(buttonBox);
        main.add(canvas);
        getContentPane().add(main);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clearButton) {
            history.clear(); // main和DrawCanvas中的history是共享的，这里一起清空了
            canvas.repaint();
        } else if (e.getSource() == colorRedButton) {
            Command command = new ColorCommand(canvas, Color.red);
            history.append(command);
            command.execute();
        } else if (e.getSource() == colorBlueButton) {
            Command command = new ColorCommand(canvas, Color.blue);
            history.append(command);
            command.execute();
        } else if (e.getSource() == colorOrangeButton) {
            Command command = new ColorCommand(canvas, Color.orange);
            history.append(command);
            command.execute();
        } else if(e.getSource() == undoButton) {
            history.undo();
            canvas.repaint();
            history.execute();
        }
    }
}
