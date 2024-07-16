package org.example.P19State;

/**
 * 负责管理状态和联系警报中心的接口
 */
public interface Context {
    /**
     * 设置时间
     * @param hour 时间
     */
    public abstract void setClock(int hour);

    /**
     * 改变状态
     * @param state 状态
     */
    public abstract void changeState(State state);

    /**
     * 联系警报中心
     * @param msg 消息
     */
    public abstract void callSecurityCenter(String msg);

    /**
     * 在警报中心留下记录
     * @param msg 信息
     */
    public abstract void recordLog(String msg);
}
