public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        if (number < 0){
            number *= -1;
        }
        int number2 = number;
        int digit = 0;
        int revrseNumber = 0;
        String reverse = "";
        while (number2 != 0){
            digit = number2 % 10;
            number2 /= 10;
            reverse += digit;
        }
        revrseNumber = Integer.parseInt(reverse);
        if (revrseNumber == number){
            return true;
        }

        return false;
    }
}
