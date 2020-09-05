public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(892));

    }
    public static int sumDigits(int number){

        int sum = 0;
        if(number >= 10){
            while(number != 0){
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }

        return -1;
    }
}
