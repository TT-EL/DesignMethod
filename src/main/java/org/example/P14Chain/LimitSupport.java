package org.example.P14Chain;

/**
 * 解决小于limit编号的值
 */
public class LimitSupport extends Support{

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
