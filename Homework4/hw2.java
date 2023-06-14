package Homework4;

import java.util.LinkedList;
import java.util.Arrays;

public class hw2 {
    LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

    
    public void enqueue(int element) {
        list.add(element);
    }
    
    public int dequeue() {
        return list.removeFirst();
    }
    
    public int first() {
        return list.getFirst();
    }
} 
//
