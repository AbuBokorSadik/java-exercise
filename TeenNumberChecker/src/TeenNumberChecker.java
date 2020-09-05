public class TeenNumberChecker {
    public static boolean hasTeen(int teen, int teen2, int teen3){
            if ((teen > 12 && teen < 20) || (teen2 > 12 && teen2 < 20) || (teen3 > 12 && teen3 < 20)){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int teen){
        if (teen > 12 && teen < 20){
            return true;
        }
        return false;
    }
}
