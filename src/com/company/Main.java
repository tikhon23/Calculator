package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое целое число");
            int a = scanner.nextInt();
            System.out.println("Введите второе целое число");
            int b = scanner.nextInt();
            System.out.println("Введите действие +, -, *, /, ^, %");
            Scanner sc = new Scanner(System.in);
            String act = sc.nextLine();

            switch (act) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Иди на хуй");
                    } else {
                        System.out.println(a / b);
                    }
                    break;
                case "^":
                    System.out.println(Math.pow(a, b));
                    break;
                case "%":
                    System.out.println(a % b);
                    break;
                default:
                    System.out.println("Вы ввели не верные числа");
                    ;
            }
        }
    }
}