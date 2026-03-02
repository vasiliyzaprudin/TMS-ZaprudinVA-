package lesson1;

//Задача *:
/*Написать программу которая будет менять местами значение целочисленных
переменных. Пример: int a = 1; int b = 2; sout(a); //выведет 2 sout(b); //выведет 1*/

public class ExStar {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;

        int n = a * 10 + b;
        b = (int) (Math.floor(n / 10));
        a = n % 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    //Программа работает, если a и b от 0 до 9;
}
