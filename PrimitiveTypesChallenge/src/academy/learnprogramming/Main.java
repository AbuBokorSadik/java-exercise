package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte byteValue = 50;
        short shortValue = 500;
        int intValue = 50000;
        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.print("longValue = ");
        System.out.println(longValue);

    }
}
