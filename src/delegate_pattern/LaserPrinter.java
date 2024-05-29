package delegate_pattern;

public class LaserPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("레이저로 프린팅 합니다");
    }
}
