package org.example.P19State;

public class NightState implements State {

    private static final NightState instance = new NightState();

    private NightState() {
    }

    public static NightState getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Emergency: Use in Night!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Push alarm [Night]");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("Phone record in Night");
    }

    @Override
    public String toString() {
        return "[Night]";
    }
}
