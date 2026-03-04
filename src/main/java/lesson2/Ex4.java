package lesson2;

//Задача 4:
/*Необходимо, чтобы программа выводила на экран вот такую последовательность:
 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.*/
public class Ex4 {
    public static void main(String[] args) {
        int n = 7;
        while (n <= 98) {
            System.out.print(n + " ");
            n = n + 7;
        }
    }
}