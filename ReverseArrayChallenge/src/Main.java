import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getArray(6);
        printArray(array);
        array = swapArray(array);
        printArray(array);
    }

    public static int[] swapArray(int[] array){
        int temp, count = array.length - 1;
        for (int i=0;i<(int) (array.length/2);i++){
            temp = array[i];
            array[i] = array[count-i];
            array[count-i] = temp;
        }
        return array;
    }

    public static int[] getArray(int number){
        System.out.println("Enter values : ");
        int[] array = new int[number];
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
}
