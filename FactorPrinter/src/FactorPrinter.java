public class FactorPrinter {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printFactors(int number){

        int counter = 1;
        if (number >= 1){

            while (counter <= (number / 2)){

                if (number % counter == 0){
                    System.out.println(counter);
                }
                counter++;
            }
            System.out.println(number);

        }else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
    }
}
