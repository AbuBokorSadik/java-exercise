public class Main {
    public static void main(String[] args) {
        int getOutput;
        getOutput = SumOddRange.sumOdd(1,100);
        System.out.println(getOutput);
        getOutput = SumOddRange.sumOdd(-1,100);
        System.out.println(getOutput);
        getOutput = SumOddRange.sumOdd(100,100);
        System.out.println(getOutput);
        getOutput = SumOddRange.sumOdd(13,13);
        System.out.println(getOutput);
        getOutput = SumOddRange.sumOdd(100,-100);
        System.out.println(getOutput);
        getOutput = SumOddRange.sumOdd(100,1000);
        System.out.println(getOutput);
    }
}