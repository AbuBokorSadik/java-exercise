public class PerfectNumber {
    public static boolean isPerfectNumber(int number){

        if (number >= 1){
            int sumOfDivisors = 0;
            int counter = 1;
            while (counter <= (number / 2)){
                if (number % counter == 0){
                    sumOfDivisors += counter;
                }
                counter++;
            }
            if (sumOfDivisors == number){
                return true;
            }
        }

        return false;
    }
}
