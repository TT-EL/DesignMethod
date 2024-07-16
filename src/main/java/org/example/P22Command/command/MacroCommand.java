package org.example.P22Command.command;

import java.util.Stack;

/**
 * 表示有多条命令整合成的命令
 */
public class MacroCommand implements Command {

    private final Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }

    public void append(Command command) {
        if (command != this) { // 防止添加了自己在执行 execute 的时候陷入死循环
            commands.push(command);
            System.out.println("Add command: " + command + " " + commands.size());
        }
    }

    /**
     * 删除最后一条命令
     */
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    /**
     * 删除所有命令
     */
    public void clear() {
        commands.clear();
    }
}
