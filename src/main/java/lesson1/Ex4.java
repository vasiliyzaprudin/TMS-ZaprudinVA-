package lesson1;

//Задача 4:
/*В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
программу, округляющую число n до ближайшего целого и выводящую результат на
экран.*/
public class Ex4 {
    public static void main(String[] args) {
        double n = 12.5;
        int m = (int) Math.round(n);
        System.out.println("m = " + m);
    }
}
