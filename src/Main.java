public class Main {
    public static void main(String[] args) {
        int currentBalance = 15000;
        int depositBalance = 10000;

        int bonus = 0;
        if (depositBalance > 1000) {
            bonus = (depositBalance / 100);
        }

        int newBalance = currentBalance + depositBalance + bonus;

        System.out.println("Ваш баланс: " + newBalance);
        System.out.println("Вам начислено бонусов: " + bonus);
    }
}