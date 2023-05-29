//вроде, так

package Homework2;

import java.util.Map;

public class hw1 {
    
    public static void main(String[] args) {
        StringBuilder whereClause = new StringBuilder();
        Map<String, String> filters = Map.of("name", "Ivanov", "country", "Russia", "city", "Moscow", "age", null);

        for (Map.Entry<String, String> entry : filters.entrySet()) {
            if (entry.getValue() != null) {
                if (whereClause.length() == 0) {
                    whereClause.append("WHERE ");
                } else {
                    whereClause.append("AND ");
                }
                whereClause.append(entry.getKey()).append("='").append(entry.getValue()).append("' ");
            }
        }

        String query = "SELECT * FROM students " + whereClause.toString();
        System.out.println(query);
    }
}
