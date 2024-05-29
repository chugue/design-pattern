package delegate_pattern;

public class PrinterManager implements Printer{
    // PrinterManager는 Printer 인터페이스와 구성관계를 가진다.
    private Printer delegate;

    // 생성자
    // Printer 인터페이스를 implements받는 모든 객체를 생성자에 주입이 가능하다.
    public PrinterManager(Printer delegate) {
        this.delegate = delegate;
    }

    // setter 생성
    public void setDelegate(Printer delegate) {
        this.delegate = delegate;
    }

    @Override
    public void print() {
        // 생성자에 주입된 Printer 인터페이스를 구현한 객체의 메소드가 동적 바인딩으로 실행이된다.
        delegate.print();
    }
}
