import java.util.ArrayList;
import java.util.List;

public class FleetManager<T extends Vehicle> {
    private final List<T> fleet = new ArrayList<>();
    public void addVehicle(T v){ fleet.add(v); }
    public void showFleet(){ for (T v : fleet) System.out.println(v); }
}
