package delegate_pattern.printer;

public class InkjetPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("잉크로 프린팅 합니다.");
    }
}
