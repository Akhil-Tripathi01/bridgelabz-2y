public class Resume<T extends JobRole> {
    private final String candidate;
    private final T role;
    public Resume(String candidate, T role){ this.candidate = candidate; this.role = role; }
    public String getCandidate(){ return candidate; }
    public T getRole(){ return role; }
    @Override public String toString(){ return candidate+" -> "+role.getTitle(); }
}
