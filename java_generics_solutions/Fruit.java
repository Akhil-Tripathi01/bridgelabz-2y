public class Fruit { 
    private final String name;
    public Fruit(String name){ this.name = name; }
    public String getName(){ return name; }
    @Override public String toString(){ return name; }
}
