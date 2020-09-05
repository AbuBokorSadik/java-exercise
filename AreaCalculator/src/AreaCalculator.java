public class AreaCalculator {

    public static double area(double radious){
        if (radious >= 0.00){
            return radious * radious * Math.PI;
        }
        return -1.00;
    }
    public static double area(double height, double width){
        if ((height >= 0.00) && (width >= 0.00)){
            return height * width;
        }
        return -1.00;
    }

}
