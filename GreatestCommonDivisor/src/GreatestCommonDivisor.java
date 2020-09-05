public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){

        if((first >= 10) && (second >= 10)){
            int minValue = first;
            if (first > second){
                minValue = second;
            }
            while (minValue != 0){
                if ((first % minValue == 0) && (second % minValue == 0)){
                    return minValue;
                }
                minValue--;
            }
            return 1;
        }

        return -1;
    }
}
