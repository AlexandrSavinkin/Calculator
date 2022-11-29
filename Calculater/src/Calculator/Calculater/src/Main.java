package Calculator.Calculater.src;


import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    static int num1;
    static int num2;
    static String operation;
    static int result = 0;
    static Roman roman = new Roman();
    static Arab arab = new Arab();

    public static void main(String[] args) throws IllegalArgumentException {

        System.out.println("_____________________<<Введите арифметическую операцию!!!>>________________________");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        try {
            System.out.println(calc(in));
        } catch (NumberFormatException e) {
            System.out.println("Не допустимы операнды, или операнды из разной системы счисления ");
        }
    }

    public static String calc(String input) throws IllegalArgumentException {

        String[] lengthInput = input.split(" ");
        if (lengthInput.length != 3) {
            throw new IllegalArgumentException("Должно быть два операнда и один оператор");
        }
        String str0 = lengthInput[0];
        operation = lengthInput[1];
        String str2 = lengthInput[2];

        num1 = arab.convertToArab(str0);
        num2 = arab.convertToArab(str2);
        if ((num1 >= 1 && num2 >= 1) & (num1 <= 10 && num2 <= 10)) {
            result = calculation(num1, num2, operation);
            if (result == 0) {
                throw new NullPointerException("Результат не может быть 0, в римской системе исчисления нет 0");
            }
            return roman.convertToRoman(result);
        }

        num1 = parseInt(str0);
        num2 = parseInt(str2);
        if ((num1 >= 1 && num2 >= 1) & (num1 <= 10 && num2 <= 10)) {
            result = calculation(num1, num2, operation);
            return String.valueOf(result);
        } else
            throw new NumberFormatException();
    }

    public static int calculation(int a, int b, String operation) {

        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Оператор должен быть ( +,-,*,/)");
        };
    }
}





