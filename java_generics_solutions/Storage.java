import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();
    public void add(T item){ items.add(item); }
    public List<T> getItems(){ return items; }
    public static void displayAll(java.util.List<? extends WarehouseItem> list){
        for (WarehouseItem w : list) System.out.println(w);
    }
}
