import java.util.Scanner;

public class ReadingUserInputChallenge {
    private static final String INVALID_VALID_MESSAGE = "Value Not In Integer Formate";
    public static int sumNumber(int number){

        int sum = 0;
        int counter = 1;
        Scanner scaner = new Scanner(System.in);
        while (counter <= number){
            System.out.print("Enter your number #" + counter + " : ");
            boolean hasNextInt = scaner.hasNextInt();
            if (hasNextInt){
                int value = scaner.nextInt();
                scaner.nextLine();
                sum += value;
            }else {
                System.out.println(INVALID_VALID_MESSAGE);
                return -1;
            }
            counter++;
        }
        scaner.close();
        return sum;
    }
}
