import com.abs.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(90,9,true);
        System.out.println("Toner level = " + printer.getTonerLevel() + " \nNumber of page printed = " + printer.getNumberOfPagePrinted());

        printer.printPage();
        System.out.println("Toner level = " + printer.getTonerLevel() + " \nNumber of page printed = " + printer.getNumberOfPagePrinted());

    }
}
