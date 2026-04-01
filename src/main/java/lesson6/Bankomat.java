package lesson6;

import java.util.Scanner;
//Решение.
public class Bankomat {

    public void changeCreditCard(CreditCard card) {

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Работа с картой №" + card.accountNumber);
            card.showBalance();

            System.out.println("Выберите операцию:");
            System.out.println("1 - Пополнить.");
            System.out.println("2 - Снять.");
            System.out.println("3 - Завершить работу.");

            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println("Введите сумму пополнения:");
                int sum = scanner.nextInt();
                card.replenishBalance(sum);

            } else if (operation == 2) {
                System.out.println("Введите сумму снятия:");
                int sum = scanner.nextInt();
                card.withdrawMoney(sum);

            } else if (operation == 3) {
                System.out.println("Работа с картой завершена.");
                break;

            } else {
                System.out.println("Неверная операция.");
            }
        }
    }

    public static void main(String[] args) {
        CreditCard CreditCard1 = new CreditCard(1, 100);
        CreditCard CreditCard2 = new CreditCard(2, 100);
        CreditCard CreditCard3 = new CreditCard(3, 100);

        Bankomat bankomat = new Bankomat();

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Выберите операцию:");
            System.out.println("1 - Работа с кредитной картой.");
            System.out.println("2 - Выход.");

            int operation = scanner.nextInt();

            if (operation == 1) {

                System.out.println("Введите номер кредитной карты.");
                int accountNumber = scanner.nextInt();

                switch (accountNumber) {
                    case 1:
                        bankomat.changeCreditCard(CreditCard1);
                        break;
                    case 2:
                        bankomat.changeCreditCard(CreditCard2);
                        break;
                    case 3:
                        bankomat.changeCreditCard(CreditCard3);
                        break;
                    default:
                        System.out.println("Карты с таким номером не существует");
                        break;
                }
            }
            else if (operation == 2) {
                CreditCard1.showBalance();
                CreditCard2.showBalance();
                CreditCard3.showBalance();
                System.out.println("Работа завершена.");
                break;

            } else {
                System.out.println("Неверная операция.");
            }
        }
    }
}