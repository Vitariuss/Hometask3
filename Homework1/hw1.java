package Homework1;

public class hw1 {
    public static void main(String[] args) {
        int n = 5; // задаем значение n 

            int triNum = 0;
            for (int i = 1; i <= n; i++) {
                triNum += i;
            }
            System.out.println("n-ое треугольное число: " + triNum);
        
            // Вычисляем n!
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("n! = " + factorial);
        
    }
}
