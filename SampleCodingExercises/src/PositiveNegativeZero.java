public class PositiveNegativeZero {
    public static void main(String[] args) {

        checkNumber(35);

    }
    public static void checkNumber(double number){
        if (number == 0){
            System.out.println("Number is Zero");
        }else if (number >=1){
            System.out.println("Number is Positive");
        }else {
            System.out.println("Number is Negative");
        }
    }
}
