import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Box
        Box<Integer> bi = new Box<>(); bi.set(10);
        Box<String> bs = new Box<>(); bs.set("Hello");
        Box<Double> bd = new Box<>(); bd.set(3.14);
        System.out.println("Box<Integer>: " + bi.get());
        System.out.println("Box<String>: " + bs.get());
        System.out.println("Box<Double>: " + bd.get());

        // 2. Pair
        Pair<String,Integer> student = new Pair<>("Amol", 20);
        System.out.println("Pair: " + student.getFirst() + ", " + student.getSecond());

        // 3. isEqual
        System.out.println("isEqual: " + Utils.isEqual("a","a"));

        // 4. maximum
        System.out.println("Maximum: " + Utils.maximum(3,7,5));

        // 5. FruitBox
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.display();
        // compile-time error if uncommented:
        // FruitBox<Car> carBox = new FruitBox<>();

        // 6. sumNumbers
        List<Integer> ints = Arrays.asList(1,2,3);
        List<Double> doubles = Arrays.asList(1.5,2.5);
        System.out.println("sum ints: " + Utils.sumNumbers(ints));
        System.out.println("sum doubles: " + Utils.sumNumbers(doubles));

        // 7. copyList
        List<Number> dest = new ArrayList<>();
        Utils.copyList(dest, ints);
        Utils.copyList(dest, doubles);
        System.out.println("dest after copy: " + dest);

        // 8. Animal printer
        List<Dog> dogs = Arrays.asList(new Dog("Rex"), new Dog("Buddy"));
        AnimalPrinter.printAnimals(dogs);

        // 9. Cart
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Phone"); electronicsCart.addItem("Headphones");
        System.out.println("Electronics cart:"); electronicsCart.displayItems();

        Cart<String> clothesCart = new Cart<>();
        clothesCart.addItem("T-Shirt"); clothesCart.addItem("Jeans");
        System.out.println("Clothes cart:"); clothesCart.displayItems();

        // 10. calculateTotal
        List<Mobile> mobiles = Arrays.asList(new Mobile("Pixel", 699.99), new Mobile("Galaxy", 799.99));
        System.out.println("total mobiles: " + Utils.calculateTotal(mobiles));

        // 11. FleetManager
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck("T1"));
        trucks.showFleet();

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike("B1"));
        bikes.showFleet();

        // 12. Storage
        Storage<Electronics> storage = new Storage<>();
        storage.add(new Electronics("E100"));
        Storage.displayAll(storage.getItems());

        // 13. Marketplace product discount
        MarketplaceProduct<String> gp = new MarketplaceProduct<>("Book A", 50.0, "Books");
        Utils.applyDiscount(gp, 10.0);
        System.out.println("After discount: " + gp);

        // 14. Courses
        Course<ExamCourse> c = new Course<>("Math", new ExamCourse());
        System.out.println(c);

        // 15. Meal plan
        Meal<VegetarianMeal> meal = new Meal<>(new VegetarianMeal());
        System.out.println("Meal plan: " + meal.getPlan().getPlanName());

        // 16. Resume
        Resume<SoftwareEngineer> r = new Resume<>("Alice", new SoftwareEngineer());
        System.out.println(r);
    }
}
