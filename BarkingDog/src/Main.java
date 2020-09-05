public class Main {
    public static void main(String[] args) {
        boolean status;
        status = BarkingDog.shouldWakeUp(true,1);
        System.out.println(status);
        status = BarkingDog.shouldWakeUp(false,2);
        System.out.println(status);
        status = BarkingDog.shouldWakeUp(true,8);
        System.out.println(status);
        status = BarkingDog.shouldWakeUp(true,-1);
        System.out.println(status);
    }
}
