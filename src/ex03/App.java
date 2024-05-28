package ex03;

import ex03.lib.OuterRabbit;

public class App {

    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        Animal rabbit = new RabbitAdaptor(new OuterRabbit());
        Doorman doorman = new Doorman();

        doorman.쫓아내(rabbit);

    }
}
