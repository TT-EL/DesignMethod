package org.example.P14Chain;

/**
 * 解决指定编号的问题
 */
public class SpecialSupport extends Support{

    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
