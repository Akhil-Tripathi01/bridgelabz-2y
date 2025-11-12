public class Meal<T extends MealPlan> {
    private final T plan;
    public Meal(T plan){ this.plan = plan; }
    public T getPlan(){ return plan; }
}
