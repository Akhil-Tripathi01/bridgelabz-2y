import java.util.List;

public class Utils {
    public static <T> boolean isEqual(T a, T b) {
        if (a == null) return b == null;
        return a.equals(b);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void copyList(java.util.List<? super Number> dest, java.util.List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }

    public static double calculateTotal(java.util.List<? extends Product> items) {
        double total = 0.0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }
}
