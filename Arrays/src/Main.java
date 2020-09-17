import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getInteger(5);
        System.out.println("Avarage = " + getAvarage(array));
    }

    public static int[] getInteger(int number){

        System.out.println("Enter " + number + " integer values");
        int[] values = new int[number];
        for (int i=0;i<number;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAvarage(int[] array){
        double sum = 0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum / array.length;
    }
}
