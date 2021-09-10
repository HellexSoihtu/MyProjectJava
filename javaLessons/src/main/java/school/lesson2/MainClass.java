package school.lesson2;

public class MainClass
{
    // задание 1
    // Создайте метод within10and20,
    // который принимает на вход два целых числа и проверяет,
    // что их сумма лежит в пределах от 10 до 20 (включительно):
    // если да – вернуть true, иначе – false

    public static boolean within10and20(int a, int b)
    {
        int c = a + b; // объявление переменной c, которая равна сумме a и b
        if (c >= 10 && c <= 20)// если сумма лежит в пределах от 10 до 20 включительно
        {
            System.out.println("true");  // вывести true
            return true;
        }
        else                             // иначе
        {
            System.out.println("false"); // вывести false
            return false;
        }
    }

    // задание 2
    // Создайте метод isPositiveOrNegative,
    // который принимает в качестве параметра целое число
    // (0 считается положительным) и печатает в консоль,
    // положительное или отрицательное число передали

    public static void isPositiveOrNegative(int a)
    {
        if (a >= 0)   // если a >=0
        {
            System.out.println("Результат положительный"); // вывести "Результат положительный"
        }
        else          // иначе
        {
            System.out.println("Результат отрицательный"); // вывести "Результат отрицательный"
        }
    }

    // задание 3
    // Создайте метод isNegative,
    // который принимает в качестве параметра целое число
    // и возвращает true, если положительное,
    // иначе - false

    public static boolean isNegativeOrPositive(int a)
    {
        if ( a>=0 )                      // если a >=0
        {
            System.out.println("true " + "Результат положительный");  // вывести true
            return true;
        }
        else                             // иначе
        {
            System.out.println("false " + "Результат отрицательный"); // вывести false
            return false;
        }
    }

    // задание 4
    // Создайте метод printWordNTimes,
    // которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку,
    // указанное количество раз

    public static void printWordNTimes(String word, int a)
    {
        for (int i = 0; i < a; i++)   // N раз
        {
            System.out.println(word); // вывести значение строки
        }
    }

    // задание 5
    // Создайте метод isLeap, который определяет,
    // является ли год високосным, и возвращает boolean
    // (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный

    public static boolean isLeap(int year) // объявление переменной года
    {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) // условие
        {
            System.out.println(year + " не високосный"); // если не високосный - false
            return false;
        }

        else
        {
            System.out.println(year + " високосный");    // если високосный - true
            return true;
        }

    }

    // задание 6
    // Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0

    public static void invertArray()
    {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // задание массива
        System.out.print("До: ");                 // вывод слова "До"
        for (int i = 0; i < arr.length; i++)

        {
            System.out.print(arr[i] + " ");         //вывод первоначального массива
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println();
        System.out.print("После:  ");               // вывод слова "После"
        for (int i : arr)
        {
            System.out.print(i + " ");              // вывод измененного массива
        }
        System.out.println();
    }
    // задание 7
    // Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями
    // 1 2 3 4 5 6 7 8 … 100

    public static void fillArray()
    {
        int[] arr = new int[100];                             // задание массива
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]); // вывод элементов массива
        }
        System.out.println();
    }

    // задание 8
    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньше 6 умножить на 2

    public static void changeArray()
    {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };  // задание массива
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 6)
            {
                arr[i] *= 2;
            }
            System.out.print(" " + arr[i]);                   // вывод измененного массива
        }
        System.out.println();
        System.out.println();
    }

    // задание 9
    // Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое),
    // с помощью цикла(-ов) заполнить его диагональные элементы
    // единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему
    // принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n]

    public static void fillDiagonal()
    {
        int[][] array = new int[4][4];     // задание массива
        for (int i = 0; i < 4; i++)        // цикл
        {
            array[i][i] = 1;
        }
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
                System.out.printf("%3d", array[i][j]);   // вывод конечного массива
            System.out.println();
            System.out.println();
        }
    }

    // задание 10
    // Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len,
    // каждая ячейка которого равна initialValue

    public static int[] returnLenArr (int len, int initialValue)
    {
        int arr[] = new int[len];                                // длина массива
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;                               // значение ячейки
            System.out.println("arr[" + i + "] = " + arr[i]);   // вывод элементов массива
        }
        return arr;
    }

    public static void main(String[] args)
    {
          within10and20(30, -5);
          isPositiveOrNegative(14);
          isNegativeOrPositive(666);
          printWordNTimes("Данила", 4);
          isLeap(2021);
          invertArray();
          fillArray();
          changeArray();
          fillDiagonal();
          returnLenArr(4, 5);

    }
}

