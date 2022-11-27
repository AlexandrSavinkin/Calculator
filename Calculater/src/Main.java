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
        System.out.println(calc(in));

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

        while ((num1 >= 1 && num2 >= 1) & (num1 <= 10 && num2 <= 10)) {
            result = calculation(num1, num2, operation);
            return roman.convertToRoman(result);
        }



        num1 = parseInt(str0);
        num2 = parseInt(str2);
        if ((num1 >= 1 && num2 >= 1) & (num1 <= 10 && num2 <= 10)) {
            result = calculation(num1, num2, operation);
            return String.valueOf(result);
        } else
            throw new NullPointerException("Вводимое число должно быть от 1 и до 10");
    }


    public static int calculation(int a, int b, String operation) {
        int result = 0;
        if (operation.equals("+")) {
            result = a + b;

        } else if (operation.equals("-")) {
            result = a - b;
        } else if (operation.equals("*")) {
            result = a * b;
        } else if (operation.equals("/")) {
            result = a / b;
        } else
            throw new IllegalArgumentException("щжожо");

        return result;
    }
}

//if ((!operation.equals("*")) || (!operation.equals("/")) || (!operation.equals("+")) || (!operation.equals("-"))) {
//        throw new IllegalArgumentException("Введите правильный оператор [+ - * /]");
//        }
//


//        switch (operation) {
//            case "*" -> result = a * b;
//            case "/" -> result = a / b;
//            case "+" -> result = a + b;
//            case "-" -> result = a - b;
//
//        }


