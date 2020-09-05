package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int value = 10000;

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + minInt);
        System.out.println("Integer Maximum Value = " + maxInt);
        System.out.println("Overflow Max Value = " + (maxInt+1));
        System.out.println("Underflow Min Value = " + (minInt-1));

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + minByte);
        System.out.println("Byte Maximum Value = " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + minShort);
        System.out.println("Short Maximum Value = " + maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + minLong);
        System.out.println("Long Maximum Value = " + maxLong);

        byte byteValue = 50;
        short shortValue = 500;
        int intValue = 50000;
        long longValue = 50000 + (10 * (byteValue + shortValue + intValue));
        System.out.print("longValue = ");
        System.out.println(longValue);
    }
}
