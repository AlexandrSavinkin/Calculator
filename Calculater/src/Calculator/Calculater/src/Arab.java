package Calculator.Calculater.src;

 public class Arab {
     public  int convertToArab(String roman) {
         return switch (roman) {
             case "I" -> 1;
             case "II" -> 2;
             case "III" -> 3;
             case "IV" -> 4;
             case "V" -> 5;
             case "VI" -> 6;
             case "VII" -> 7;
             case "VIII" -> 8;
             case "IX" -> 9;
             case "X" -> 10;
             default -> -1;
         };
     }

}
