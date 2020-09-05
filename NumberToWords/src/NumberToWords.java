public class NumberToWords {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static int getDigitCount(int number){

        int digitCount = 0;
        if (number > 0){
            while (number != 0){
                number /= 10;
                digitCount++;
            }
            return digitCount;
        }else if(number == 0){
            return 1;
        }
        return -1;
    }

    public static int reverse(int number){
        int digit;
        int reverseNumber = 0;

        while (number != 0){
            digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }

        return reverseNumber;
    }

    public static void numberToWords(int number){

        int digitCounter = getDigitCount(number);
        number = reverse(number);
        if (number > 0){
            int digit;
            while (digitCounter > 0){
                digit = number % 10;
                number /= 10;
                switch (digit){
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }
                digitCounter--;
            }
        }else if (number == 0){
            System.out.println("Zero");
        }else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }

    }
}
