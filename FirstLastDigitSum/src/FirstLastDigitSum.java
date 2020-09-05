public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number >= 0){
            int counter = 0;
            int digit = 0;
            int sum =0;
            while (number != 0){

                digit = number % 10;
                number = number / 10;
                if (counter == 0 || number == 0){
                    sum += digit;
                }
                counter++;
            }
            if (counter == 1){
                sum += sum;
            }
            return sum;
        }
        return -1;
    }
}
