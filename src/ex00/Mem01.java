package ex00;

abstract class Car{
    abstract void run();
}
class Sonata extends Car{
    @Override
    void run() {
        System.out.println("소나타가 달린다.");
    }

    static int n1 = 1;
    int n2 = 2;
}
class Genesis extends Car{
    @Override
    void run() {
        System.out.println("제네시스가 달린다. ");
    }
}


public class Mem01 {
    public static void main(String[] args) {
        Car car = new Genesis();

        car.run();
    }
}
