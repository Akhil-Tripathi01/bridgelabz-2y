public abstract class WarehouseItem {
    private final String id;
    public WarehouseItem(String id){ this.id = id; }
    public String getId(){ return id; }
    @Override public String toString(){ return getClass().getSimpleName()+":"+id; }
}
