package day5.multipleInterfaces;

public class Printer implements Printable, Scannable{

    @Override
    public void canPrint() {
        System.out.println("This printer can print");
    }

    @Override
    public void canScan() {
        System.out.println("This printer can scan");
    }
}
