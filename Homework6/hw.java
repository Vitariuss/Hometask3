package Homework6;
import java.util.*;

public class hw {
    public static class Notebook {
        private String color;
        private String brand;
        private double price;


    public Notebook(String color, String brand, double price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

public static void main(String[] args) {
    Set<Notebook> notebooks = new HashSet<>();
    notebooks.add(new Notebook("Black", "Dell", 1000));
    notebooks.add(new Notebook("Blue", "Lenovo", 950));
    notebooks.add(new Notebook("Red", "HP", 1200));
    notebooks.add(new Notebook("Black", "HP", 1100));
    notebooks.add(new Notebook("Blue", "Lenovo", 1950));
    notebooks.add(new Notebook("Red", "Dell", 1300));
    notebooks.add(new Notebook("Black", "Asus", 1050));
    notebooks.add(new Notebook("Blue", "Acer", 850));
    notebooks.add(new Notebook("Red", "HP", 1200));
    notebooks.add(new Notebook("Black", "HP", 1100));
    notebooks.add(new Notebook("Blue", "Lenovo", 1950));
    notebooks.add(new Notebook("Red", "Dell", 1350));       
    filterNotebooks(notebooks);
}

public static void filterNotebooks(Set<Notebook> notebooks) {
    Scanner scanner = new Scanner(System.in, "Cp1251"); 
    System.out.println("Choose the filter:");
    System.out.println("1 - colour (" + Arrays.toString(notebooks.stream().map(Notebook::getColor).distinct().toArray()) + ")");
    System.out.println("2 - brand (" + Arrays.toString(notebooks.stream().map(Notebook::getBrand).distinct().toArray()) + ")");

    int filterCriteria = scanner.nextInt();
    scanner.nextLine();

    switch (filterCriteria) {
        case 1:
            System.out.print("What colour do you need: "); 
            String color = scanner.nextLine();
            notebooks.stream()
                   .filter(notebook -> notebook.getColor().equalsIgnoreCase(color))
                   .forEach(System.out::println);
            break;

        case 2:
            System.out.print("What brand do you need: ");
            String brand = scanner.nextLine();
            notebooks.stream()
                   .filter(notebook -> notebook.getBrand().equalsIgnoreCase(brand))
                   .forEach(System.out::println);
            break;
        default: 
            System.out.println("Wrong input.");
            return; 
    }
}
}