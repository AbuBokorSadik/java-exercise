import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(array);
        array = sortIntegers(array).clone();
        printArray(array);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter values: ");
        int[] array = new int[number];
        for (int i=0;i<number;i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.println("Print values: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] array){
        int temp;
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1;j++){
                if (array[j]<array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
