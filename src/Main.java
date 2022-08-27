public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int replenishment = 1002;
        int bonus = (replenishment) / 100;
        if ((replenishment) > 1000) {
            System.out.println("Баланс");
            System.out.println(balance + replenishment + bonus);
            System.out.println("Ваш бонус :" + bonus);
        } else {
            System.out.println("Баланс");
            System.out.println(balance + replenishment);
            System.out.println("Ваш бонус равен:0");


        }
    }
}
