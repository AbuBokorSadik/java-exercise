public class Main {
    public static void main(String[] args) {
        int getOutput;
        getOutput = NumberOfDaysInMonth.getDaysInMonth(1,2020);
        System.out.println(getOutput);
        getOutput = NumberOfDaysInMonth.getDaysInMonth(2,2020);
        System.out.println(getOutput);
        getOutput = NumberOfDaysInMonth.getDaysInMonth(2,2018);
        System.out.println(getOutput);
        getOutput = NumberOfDaysInMonth.getDaysInMonth(-1,2020);
        System.out.println(getOutput);
        getOutput = NumberOfDaysInMonth.getDaysInMonth(2,-2020);
        System.out.println(getOutput);
    }
}
