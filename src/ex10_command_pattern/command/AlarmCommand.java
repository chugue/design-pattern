package ex10_command_pattern.command;

import ex10_command_pattern.alarm.Alarm;

public class AlarmCommand implements Command {
    private Alarm alarm;

    public AlarmCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.alarmOn();
    }
}
