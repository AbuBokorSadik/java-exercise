public class Main {
    public static void main(String[] args) {
        boolean status;
        status = LeapYear.isLeapYear(-1600);
        System.out.println(status);
        status = LeapYear.isLeapYear(1600);
        System.out.println(status);
        status = LeapYear.isLeapYear(2017);
        System.out.println(status);
        status = LeapYear.isLeapYear(2000);
        System.out.println(status);
        status = LeapYear.isLeapYear(1800);
        System.out.println(status);

    }
}
