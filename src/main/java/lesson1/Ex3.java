package lesson1;

//Задача 3:
/*В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
выводящую на экран сумму цифр n. Например: n = 126, в результате мы должны получить 9 (1+2+6).*/
public class Ex3 {
    public static void main(String[] args) {
        int n = 261;

        int m = (int) (Math.floor(n / 100)); // Количество сотен
        int l = (int) (Math.floor((n - m * 100) / 10)); //Количество десятков
        int o = n - (m * 100 + l * 10); //Количество единиц

        int p = m + l + o;
//        System.out.println("m = " + m);
//        System.out.println("l = " + l);
//        System.out.println("o = " + o);
        System.out.println("p = " + p);

    }
}
