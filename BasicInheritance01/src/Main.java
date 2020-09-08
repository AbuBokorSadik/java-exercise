import com.bat.My_Calculation;

public class Main {

    public static void main(String[] args) {
        double firstNumber = 5, secondNumber = 6, result = 0;
        My_Calculation calculation = new My_Calculation();
//        result = calculation.addition(firstNumber,secondNumber);
//        System.out.println("Addition = " + result);

        calculation.setFirstNumber(firstNumber);
        calculation.setSecondNumber(secondNumber);
        result = calculation.addition();
        System.out.println("Addition = " + result);
        System.out.println("Divition = " + calculation.divition(firstNumber, secondNumber));


    }
}
