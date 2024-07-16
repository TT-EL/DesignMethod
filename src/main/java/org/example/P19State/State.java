package org.example.P19State;

/**
 * 表示金库状态的类
 */
public interface State {
    /**
     * 设置时间的方法
     *
     * @param context 管理状态的接口
     * @param hour    时间
     */
    public abstract void doClock(Context context, int hour);

    /**
     * 使用金库的方法
     *
     * @param context 管理状态的接口
     */
    public abstract void doUse(Context context);

    /**
     * 警铃响起的方法
     *
     * @param context 管理状态的接口
     */
    public abstract void doAlarm(Context context);

    /**
     * 正常通话被调用的方法
     *
     * @param context 管理状态的接口
     */
    public abstract void doPhone(Context context);
}
