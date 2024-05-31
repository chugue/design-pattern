package ex10_command_pattern;

import ex10_command_pattern.command.Command;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press(){
        command.execute();
    }
}
