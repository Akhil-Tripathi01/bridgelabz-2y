public class Vehicle {
    private final String id;
    public Vehicle(String id){ this.id = id; }
    public String getId(){ return id; }
    @Override public String toString(){ return getClass().getSimpleName()+":"+id; }
}
