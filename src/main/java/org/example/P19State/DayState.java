package org.example.P19State;

public class DayState implements State {

    private static final DayState instance = new DayState();

    private DayState() {

    }

    public static DayState getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("Use money base [Day]");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Push alarm [Day]");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Phone normally [Day]");
    }

    @Override
    public String toString() {
        return "[Day]";
    }
}
