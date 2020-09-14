import com.abs.Car;
import com.abs.Ford;
import com.abs.Honda;
import com.abs.Jeep;

public class Main {
    public static void main(String[] args) {
        for (int i =1; i < 11; i++){
            Car car = selectRandomCar();
            System.out.println("Car Select #" + i + "\nName : " + car.getName() + "\nCylinders : " + car.getCylinders());
            car.startEngine();
            car.accelerate();
            car.brake();
        }
    }

    public static Car selectRandomCar(){
        int selectRandomCar = (int) (Math.random() * 3) +1;

        switch (selectRandomCar){
            case 1:
                return new Honda(2);
            case 2:
                return new Jeep(3);
            case 3:
                return new Ford(4);
        }
        return null;
    }
}
