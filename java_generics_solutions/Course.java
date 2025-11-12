public class Course<T extends CourseType> {
    private final String title;
    private final T type;
    public Course(String title, T type){ this.title = title; this.type = type; }
    public String getTitle(){ return title; }
    public T getType(){ return type; }
    @Override public String toString(){ return title+" ["+type.getName()+"]"; }
}
