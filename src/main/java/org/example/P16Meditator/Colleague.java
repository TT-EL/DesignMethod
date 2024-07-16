package org.example.P16Meditator;

/**
 * 向Mediator进行报告的组员的接口
 */
public interface Colleague {

    /**
     * 设置组员要报告的Mediator实例
     * @param mediator
     */
    public abstract void setMediator(Mediator mediator);

    /**
     * 告知组员Mediator下达的命令
     * @param enable 启用状态
     */
    public abstract void setColleagueEnable(boolean enable);
}
