import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();
    public void add(T fruit){ fruits.add(fruit); }
    public void display() {
        for (T f : fruits) System.out.println(f);
    }
}
