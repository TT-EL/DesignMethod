package org.example.P14Chain;

/**
 * 解决奇数编号的问题
 */
public class OddSupport extends Support{

    public OddSupport(String name) {
        super(name);

    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
