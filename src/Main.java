public class Main {
    public static void main(String[] args) {
        int account = 13;
        int pay = 1999;
        int border = 1000;
        int rule = 100;

        if (pay < border) {
            System.out.println("Ваш счёт:");
            System.out.println(pay + account);
            System.out.println("рублей");
            System.out.println("Ваш бонус 0 рублей");
        } else {
            int bonus = pay / rule;
            int realBonus = ((bonus * rule) > pay) ? (account + pay + (bonus - 1)) : (account + pay + bonus);
            System.out.println("Ваш счёт:");
            System.out.println(realBonus);
            System.out.println("рублей");
            System.out.println("Ваш бонус:");
            System.out.println(realBonus - account - pay);
            System.out.println("рублей");
        }
    }
}