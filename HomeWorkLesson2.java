/**
 * Java L1. Homework 2
 *
 * Maria Ralko
 * 15.02.2022
 */
class HomeWorkLesson2 {
    
    public static void main(String[] args) {
        System.out.println(between10and20(8, 8));
        System.out.println(between10and20(-8, 13));
        System.out.println(between10and20(8, 13));
        
        isPositiveOrNegative(7);
        isPositiveOrNegative(-7);
        isPositiveOrNegative(0);
        
        System.out.println(isNegative(5));
        System.out.println(isNegative(-5));
        System.out.println(isNegative(0));
        
        writeString("What's the weather today?", 4);
        
        System.out.println(leapYear(2004));
        System.out.println(leapYear(2007));
        System.out.println(leapYear(2008));
        System.out.println(leapYear(2011));
    }
    
    static boolean between10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void isPositiveOrNegative(int x) {
        System.out.println(x >= 0? "Positive" : "Negative");
    }
    
    static boolean isNegative(int x) {
        return x < 0;
    }
    
    static void writeString(String a, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(a);
        }
    }
    
    static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}