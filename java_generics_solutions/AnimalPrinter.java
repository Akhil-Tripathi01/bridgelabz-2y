import java.util.List;
public class AnimalPrinter {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a);
    }
}
