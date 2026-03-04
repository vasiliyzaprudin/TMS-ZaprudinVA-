package lesson2;

import java.util.Scanner;

//Задача 2:
/*Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».*/
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение темпетаруры.");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Тепло.");
        } else if (t > -20 && t <= -5) {
            System.out.println("Нормально.");
        } else {
            System.out.println("Холодно.");
        }
    }
}
