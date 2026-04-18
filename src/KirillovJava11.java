import java.util.Arrays;
import java.util.Scanner;

public class KirillovJava11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ========== Задание 1: числа ==========
        System.out.println("=== Задание 1 ===");
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // Сравнение
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        // Проверка деления на ноль
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("a / b = Деление на ноль невозможно");
        }

        // ========== Задание 2: строки ==========
        scanner.nextLine(); // очистка буфера после nextInt()
        System.out.println("\n=== Задание 2 ===");
        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }

        // ========== Задание 3: чётные числа ==========
        System.out.println("\n=== Задание 3 ===");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Массив: " + Arrays.toString(numbers));
        System.out.print("\nЧётные числа из массива: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}