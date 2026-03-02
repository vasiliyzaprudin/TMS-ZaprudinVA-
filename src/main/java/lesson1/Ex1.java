package lesson1;

//Задача 1:
/*Написать приложение, которое будет вычислять и выводить значение по формуле:
a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.*/
public class Ex1 {
    public static void main(String[] args) {
        double b = 5.0;
        double c = 3.0;
        double a = 4.0 * (b + c - 1) / 2;
        System.out.println("a = " + a);
    }
}
