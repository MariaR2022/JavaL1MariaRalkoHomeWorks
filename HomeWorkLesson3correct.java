/**
 * Java L1. Homework 3
 *
 * Maria Ralko
 * 18.02.2022
 */
 
class HomeWorkLesson3correct {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arr4 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        changeElements(arr1);
        fillTheArray(100);
        multiplyByTwo(arr3);
        squareMatrix(arr4);
        array5(7, 3);
    }
    
// Задание 1. Замена элементов в массиве с помощью цикла и условия.    
    static void changeElements(int[] arr1) {    
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==0) {
                arr1[i] = 1;
            } else 
                arr1[i] = 0;
            System.out.println(arr1[i] + " "); 
        } 
        System.out.println();            
    }
    
// Задание 2. Заполнение массива (определенной длины) значениями с помощью цикла.
    static void fillTheArray(int size) {
        int[] arr2 = new int[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.println(arr2[i] + " ");
        }
        System.out.println();
    }     
    
// Задание 3. Задать массив и числа из него, которые меньше 6, умножить на 2.
    static void multiplyByTwo(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] *2;
            }
            System.out.println(arr3[i] + " ");
        }
        System.out.println();
    }
    
// Задание 4. Квадратный двумерный массив, диагональные элементы равны единицам.
    static void squareMatrix(int[][] arr4) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j || 3 - i - 1 == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

// Задание 5. 
    static int[]  array5(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < len; i++) {
            arr5[i] = initialValue;
            System.out.print(arr5[i] + " ");
        }
        return arr5;
    }
}