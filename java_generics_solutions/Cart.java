import java.util.ArrayList;
import java.util.List;

public class Cart<T> {
    private final List<T> items = new ArrayList<>();
    public void addItem(T item){ items.add(item); }
    public void removeItem(T item){ items.remove(item); }
    public void displayItems(){
        for (T t : items) System.out.println(t);
    }
}
