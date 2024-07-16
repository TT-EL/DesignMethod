package org.example.P14Chain;

/**
 * 用来解决问题的抽象类，是职责链上的对象
 */
public abstract class Support {
    private String name;

    private Support next;

    public Support(String name) {
        this.name = name;
    }

    /**
     * 设置要推卸的对象
     *
     * @param next 目标对象
     * @return 目标对象
     */
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * 定义解决问题的步骤
     *
     * @param trouble 问题
     */
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble); // 抽象方法，解决问题的方法

    protected void done(Trouble trouble) { // 解决
        System.out.println(trouble + " is resolved by" + this);
    }

    protected void fail(Trouble trouble) { // 未解决
        System.out.println(trouble + " can not resolved");
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ']';
    }
}
