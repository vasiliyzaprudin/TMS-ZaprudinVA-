package lesson1;

//Задача 2:
/*В переменной n хранится двузначное число. Создайте программу, вычисляющую и
выводящую на экран сумму цифр n. Например: n = 26, в результате мы должны получить 8 (2+6).*/

public class Ex2 {
    public static void main(String[] args) {
        int n = 12;
        int m = (int) (Math.floor(n / 10) + n % 10);
        System.out.println("m = " + m);
    }
}
