public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = 5, b = 105;
        System.out.println(a + b >= 0? "The amount is positive" : "The amount is negative");
        //if(a + b >= 0) {
        //    System.out.println("The amount is positive");
        //} else {
        //    System.out.println("The amount is negative");
        //}
    }
    static void printColor() {
         int value = 8;
         if(value <= 0) {
             System.out.println("Red");
         } else if(value <= 100) {
             System.out.println("Yellow");
         } else {
             System.out.println("Green");
         }
     }
    static void compareNumbers() {
         int a = 23, b = 38;
         System.out.println(a >= b? "a >= b" : "a <= b");
         //if(a >= b) {
         //    System.out.println("a >= b");
         //} else {
         //    System.out.println("a <= b");
         //}
     }
    }