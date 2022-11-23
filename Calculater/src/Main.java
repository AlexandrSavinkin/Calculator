import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        int res = 0;
        System.out.println("_____________________<<Введите арифметическую операцию!!!>>________________________");
        System.out.println(calc(String.valueOf(res)));

    }
    public static String calc(String input) {
        String[] arab = {"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] rome = {"X", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        input = scanner.nextLine();
        for (String s : rome) {
            if (input.equals(s)) {
                return String.valueOf(RomanNums.toArabic(s));
            } else
                System.out.println("no");
        }

        for (String s : arab) {
            if (input.equals(s)) {
                return RomanNums.toRoman(Integer.parseInt(s));
            } else
                System.out.println("n1");
        }

        String[] lengthInput = input.split("");

        String num1, num2, operation;

        num1 = lengthInput[0];
        operation = lengthInput[1];
        num2 = lengthInput[2];

        int result = 0;

        if (lengthInput.length == 3) {
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            switch (operation) {
                case "*" -> result = a * b;
                case "/" -> result = a / b;
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                default -> System.out.println("ERROR");
            }

        } else
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Три элемента должно быть!!!!");

            }


        return String.valueOf(result);


    }


}



