import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
// Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

// Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986
        double[] arr2 = {1.57, 7.654, 9.986};

// Произвольный массив
        char[] arr3 = {'s', 'k', 'y', 'p', 'r', 'o'};

        System.out.println("");
        System.out.println("Задача 2");
// распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("");
        System.out.println("Задача 3");
// распечатайте все элементы всех трех массивов в обратном порядке
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("");
        System.out.println("Задача 4");
// Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] = arr1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}