public class Main {
    public static void main(String[] args) {
        int Account = 13;
        int Pay = 999;
        int Border = 1000;
        int Rule = 100;

        if (Pay < Border) {
            System.out.println(Pay + Account);
        } else {
            int Bonus = Pay / Rule;
            int RealBonus = ((Bonus * Rule) > Pay) ? (Account + Pay + (Bonus - 1)) : (Account + Pay + Bonus);
            System.out.println(RealBonus);
        }
    }
}