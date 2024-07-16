package org.example.P14Chain;

/**
 * 表示一个永远不解决问题的类
 */
public class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
