public class Main {
    public static void main(String[] args) {
        int currentAccount = 300;
        int replenishmentAmount = 1500;

        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        if (bonus > 1000) {
            bonus = 1000;
        }

        int total = currentAccount + replenishmentAmount + bonus;

        System.out.println("Заработано бонусов = " + bonus);
        System.out.println("Всего на счету = " + total);
    }
}