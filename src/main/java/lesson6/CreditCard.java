package lesson6;

/*Задача 1.
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает
три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: положите деньги на первые две карточки и снимите
с третьей. Выведите на экран текущее состояние всех трех карточек.*/
//Решение.

public class CreditCard {
    int accountNumber;
    int balance;

    //Конструктор кредитной карты
    CreditCard(int a, int b) {
        accountNumber = a;
        balance = b;
    }

    /**
     * Этот метод пополняет баланс кредитной карты с номером accountNumber на сумму sum.
     *
     * @param sum           сумма пополнения
     */
    public void replenishBalance(int sum) {
        balance = balance + sum;
        System.out.println("Успешно.");
    }

    /**
     * Этот метод снимает с кредитной карты с номером accountNumber сумму sum.
     *
     * @param sum           сумма снятия
     */
    public void withdrawMoney(int sum) {
        if (balance >= sum) {
            balance = balance - sum;
            System.out.println("Успешно.");
        } else System.out.println("Недостаточно средств.");
    }

    /**
     * Этот метод выводит информацию о балансе кредитной карты.
     */
    public void showBalance() {
        System.out.println("Баланс кредитной карты: " + balance);
    }
}