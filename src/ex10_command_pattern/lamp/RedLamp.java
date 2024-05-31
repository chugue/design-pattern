package ex10_command_pattern.lamp;

public class RedLamp implements Lamp{
    @Override
    public void lampOn() {
        System.out.println("빨간 색 불이 켜졌습니다.");
    }
}
