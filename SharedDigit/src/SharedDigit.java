public class SharedDigit {
    public static boolean hasSharedDigit(int number, int number2){
        if (((number >=10) && (number <= 99)) && ((number2 >=10) && (number2 <= 99))){
            while (number != 0){
                int digit;
                digit = number % 10;
                number /= 10;
                int tempNumber = number2;
                while (tempNumber != 0){
                    int tempDigit;
                    tempDigit = tempNumber % 10;
                    tempNumber /= 10;
                    if (digit == tempDigit){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
