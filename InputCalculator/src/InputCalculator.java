import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int counter = 0;
        long average = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                counter++;
            }else {
                break;
            }
        }
        scanner.close();
        average = Math.round((double) sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
