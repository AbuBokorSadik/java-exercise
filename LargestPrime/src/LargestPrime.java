public class LargestPrime {
    public static int getLargestPrime(int number){

        int factor = number;

        while ((factor >= 2)){
            if (number % factor == 0){
                int counter = (factor / 2);
                int remark = 0;
                while (counter >= 2){
                    if (factor % counter == 0){
                        remark++;
                    }
                    counter--;
                }
               if (remark == 0){
                   return factor;
               }
            }
            factor--;
        }

        return -1;
    }
}
