public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number, int number2, int number3){

        if ((isValid(number)) && (isValid(number2)) && (isValid(number3))){
            if((number % 10 == number2 % 10) || (number2 % 10 == number3 % 10) || (number3 % 10 == number % 10)){
                return true;
            }
        }

        return false;
    }

    public static boolean isValid(int number){

        if (number >= 10 && number <= 1000){
            return true;
        }

        return false;
    }
}
