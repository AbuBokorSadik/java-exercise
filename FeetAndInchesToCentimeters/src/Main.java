public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(157);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && ((inches >= 0) && (inches <= 12))){
            double centimeters = (feet * 30.48000d) + (inches * 2.540000d);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
        System.out.println("Invalid Value");
        return -1d;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet, centimeters;
            centimeters = inches * 2.540000d;
            feet = (int) inches / 12;
            System.out.print(inches + "inches = ");
            inches = inches - (feet * 12);
            System.out.println(feet + " feet, " + inches + " inches");
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
        System.out.println("Invalid Value");
        return -1d;
    }
}
