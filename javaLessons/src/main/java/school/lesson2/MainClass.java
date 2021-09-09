package school.lesson2;

public class MainClass
{
    // задание 1
    // Создайте метод within10and20,
    // который принимает на вход два целых числа и проверяет,
    // что их сумма лежит в пределах от 10 до 20 (включительно):
    // если да – вернуть true, иначе – false.

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

    public static void main(String[] args)
    {     within10and20(30, -5);

    }
}

