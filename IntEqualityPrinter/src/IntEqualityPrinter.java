public class IntEqualityPrinter {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printEqual(int number, int number2, int number3){

        if ((number < 0) || (number2 < 0) || (number3 < 0)){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else if ((number == number2) && (number2 == number3)){
            System.out.println("All numbers are equal");
        }else if ((number == number2) || (number2 == number3) || (number == number3)){
            System.out.println("Neither all are equal or different");
        }else {
            System.out.println("All numbers are different");
        }

    }
}
