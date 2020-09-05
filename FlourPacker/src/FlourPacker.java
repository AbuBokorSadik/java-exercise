public class FlourPacker {
    public static final int BIG_PACK_SIZE = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount >= 0) && (smallCount >= 0) && (goal >= 0)){
            if (goal <= ((bigCount * BIG_PACK_SIZE) + smallCount)){
                if ((bigCount == 0) && (goal <= smallCount)){
                    return true;
                }else if ((smallCount == 0) && (goal % BIG_PACK_SIZE == 0)){
                    return true;
                }else if ((goal % BIG_PACK_SIZE <= smallCount) && (bigCount != 0) && smallCount != 0){
                    return true;
                }
            }
        }

        return false;
    }
}
