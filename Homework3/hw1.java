package Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class hw1 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 8, 3, 5, 2, 7, 4, 6));



        lst.removeIf(x -> x % 2 == 0);

        int minVal = Collections.min(lst);


        int maxVal = Collections.max(lst);

        double avgVal = lst.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Список после удаления четных чисел: " + lst);
        System.out.println("Минимальное значение: " + minVal);
        System.out.println("Максимальное значение: " + maxVal);
        System.out.println("Среднее значение: "+ avgVal);
    }
}
