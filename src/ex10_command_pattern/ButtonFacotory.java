package ex10_command_pattern;

import ex10_command_pattern.alarm.Alarm;
import ex10_command_pattern.command.AlarmCommand;
import ex10_command_pattern.command.LampCommand;
import ex10_command_pattern.lamp.BlueLamp;
import ex10_command_pattern.lamp.RedLamp;

public class ButtonFacotory {
    private static ButtonFacotory instance = new ButtonFacotory();

    private ButtonFacotory() {}

    public static ButtonFacotory getInstance() { return instance; }

    public Button createButton(String command){ // blueLamp, redLamp, alarm
        if(command.equals("blueLamp")){
            Button blueLampButton = new Button(new LampCommand(new BlueLamp()));
            return blueLampButton;
        } else if (command.equals("redLamp")) {
            Button redLampButton = new Button(new LampCommand(new RedLamp()));
            return redLampButton;
        } else if (command.equals("alarm")) {
            Button alarmButton = new Button(new AlarmCommand(new Alarm()));
            return alarmButton;
        }else{
            System.out.println("유효한 값이 아닙니다.");
            return null;
        }
    }
}
