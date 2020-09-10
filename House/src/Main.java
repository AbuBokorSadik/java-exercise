import com.abs.Dimensions;
import com.abs.Furniture;
import com.abs.House;
import com.abs.Room;

public class Main {
    public static void main(String[] args) {
        Furniture furniture = new Furniture("Bed", "Wood", "Brown", new Dimensions(6,8));
        Room room = new Room("Bed room",new Dimensions(10,20),furniture);
        House house = new House(room, new Dimensions(10,200));
        house.roomDefinations();
    }
}
