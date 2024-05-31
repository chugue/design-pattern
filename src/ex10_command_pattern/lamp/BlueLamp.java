package ex10_command_pattern.lamp;

public class BlueLamp implements Lamp {

    @Override
    public void lampOn() {
        System.out.println("파랑색 불이 켜졌습니다.");
    }
}
