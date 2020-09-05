public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number, double number2){

        number = number * 10000;
        number = number / 10;
        int doubleToIntNumber = (int) number;

        number2 = number2 * 10000;
        number2 = number2 / 10;
        int doubleToIntNumber2 = (int) number2;

        if (doubleToIntNumber == doubleToIntNumber2){
            return true;
        }

        return false;
    }
}
