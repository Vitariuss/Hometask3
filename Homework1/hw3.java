package Homework1;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Введите оператор (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Ошибка! Некорректный оператор.");
                return;
        }

        System.out.println("Результат: " + (int)result);

    }
}