package ex10_command_pattern.command;

import ex10_command_pattern.lamp.Lamp;

public class LampCommand implements Command {
    private Lamp lamp;

    public LampCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.lampOn();
    }
}
