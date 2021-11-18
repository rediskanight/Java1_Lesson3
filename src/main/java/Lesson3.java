import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
      //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("задание 1");
        int[] arr_1  = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
       int a;
       int b;
        System.out.println(Arrays.toString(arr_1));
        for(int i = 0; i < 10; i++) {
            a = arr_1[i] ;
            if (a == 0){a = 1; arr_1[i] = a;}
            else if (a==1){a = 0; arr_1[i] = a;}
                        }
        System.out.println(Arrays.toString(arr_1));
        // Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        System.out.println("задание 2");
        int[] arr_2  = new int[100];
        for(int i = 0; i < 100; i++){arr_2[i]=i+1;}
        System.out.println(Arrays.toString(arr_2));


        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr_3  = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("задание 3");
        System.out.println(Arrays.toString(arr_3));
                for(int i = 0; i < 11; i++){b = arr_3[i]; if (b < 6){arr_3[i]*=2;} }
        System.out.println(Arrays.toString(arr_3));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
                System.out.println("задание 4");
        int[][] arr_4 = new int[7][7];
        int c;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++){
                if (j == i ) {
                    if(j != i){arr_4[i][j]=0;}
                } else {arr_4[i][j]=1;}
                System.out.print(arr_4[i][j] + " ");}
            System.out.println( " ");
                    }
        declareArr(5,7);

    }
//Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void declareArr(int len, int initialValue) {
        int[] arr_5 = new int[len];
                System.out.println("задание 5");
        for(int i = 0; i < len; i++) {
            arr_5[i] = initialValue;
        }System.out.println(Arrays.toString(arr_5));
    }}
