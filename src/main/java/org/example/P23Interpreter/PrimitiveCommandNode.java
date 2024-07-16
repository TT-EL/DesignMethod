package org.example.P23Interpreter;

// <primitive command> ::= go | right | left
public class PrimitiveCommandNode extends Node {

    /**
     * 命令名称
     */
    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
