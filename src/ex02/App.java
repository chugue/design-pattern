package ex02;

public class App {

    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        DoormanProxy doormanProxy = new DoormanProxy();
        doormanProxy.쫓아내(tiger);

    }
}
