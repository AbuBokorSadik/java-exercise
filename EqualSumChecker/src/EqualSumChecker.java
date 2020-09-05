public class EqualSumChecker {
    public static boolean hasEqualSum(int number, int number2, int number3){
        if((number + number2) == number3){
            return true;
        }
        return false;
    }
}
