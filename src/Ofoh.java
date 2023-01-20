public class Ofoh {

    public static void main(String[] args) {

        int balance = 500;
        int amount = 1300;
        int sum = 0;
        int bonus = 0;

        if (amount > 1000) {
            bonus = amount / 100;
            sum = balance + amount + bonus;
        } else {
            sum = balance + amount;
        }
        System.out.println("Ваш Бонус: " + bonus);
        System.out.println("Ваш Баланс: " + sum);
    }

}
