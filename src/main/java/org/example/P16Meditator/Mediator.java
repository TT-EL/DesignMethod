package org.example.P16Meditator;

/**
 * 定义“仲裁者”的接口的接口
 */
public interface Mediator {

    /**
     * 生成Mediator要管理的组员
     */
    public abstract void createColleagues();

    /**
     * 被各个Colleague组员调用以向Mediator报告
     */
    public abstract void colleagueChanged();
}
