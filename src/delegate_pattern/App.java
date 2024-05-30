package delegate_pattern;

import delegate_pattern.printer.InkjetPrinter;
import delegate_pattern.printer.LaserPrinter;
import delegate_pattern.printer.PrinterManager;

public class App {
    public static void main(String[] args) {
        // InkjetPrinter를 사용하는 PrinterManager
        PrinterManager inkManager = new PrinterManager(new InkjetPrinter());
        inkManager.print();

        PrinterManager laserManager = new PrinterManager(new LaserPrinter());
        laserManager.print();
    }
}
