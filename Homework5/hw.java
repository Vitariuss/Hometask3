package Homework5;
import java.util.*;

public class hw {
    public static void main(String[] args) {
        
        HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

        addPhoneNumber("Иван", "123-456", phoneBook);
        addPhoneNumber("Иван", "789-101", phoneBook);
        addPhoneNumber("Анна", "111-222", phoneBook);
        addPhoneNumber("Андрей", "751-222", phoneBook);
        addPhoneNumber("Гера", "741-272", phoneBook);
        addPhoneNumber("Гера", "741-784", phoneBook);
        addPhoneNumber("Гера", "285-784", phoneBook);
        addPhoneNumber("Артур", "784-784", phoneBook);
        addPhoneNumber("Кеша", "768-153", phoneBook);

        printSortedPhoneBook(phoneBook);
    }

    public static void addPhoneNumber(String name, String phoneNumber, HashMap<String, HashSet<String>> phoneBook) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
        } else {
            HashSet<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public static void printSortedPhoneBook(HashMap<String, HashSet<String>> phoneBook) {
        List<Map.Entry<String, HashSet<String>>> list = new ArrayList<>(phoneBook.entrySet());

        list.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, HashSet<String>> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
    
