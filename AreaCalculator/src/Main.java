public class Main {
    public static void main(String[] args) {

        double getOutput = AreaCalculator.area(5);
        System.out.println(getOutput);
        getOutput = AreaCalculator.area(-1);
        System.out.println(getOutput);
        getOutput = AreaCalculator.area(5,4);
        System.out.println(getOutput);
        getOutput = AreaCalculator.area(-1,4);
        System.out.println(getOutput);

    }
}
