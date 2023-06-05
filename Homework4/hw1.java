package Homework4;

import java.util.LinkedList;
import java.util.Arrays;

public class hw1 {
    LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3));

public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
    LinkedList<Integer> reversedList = new LinkedList<>();
    for (int i = list.size() - 1; i >= 0; i--) {
        reversedList.add(list.get(i));
    }
    return reversedList;
}

LinkedList<Integer> reversed = reverseLinkedList(list);
}




