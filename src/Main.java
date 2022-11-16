public class Main {
    public static void main(String[] args) {
        int amount = 20_000;
        int bonusRatio = 20;

        int bonusMile = amount / bonusRatio;

        System.out.println((bonusMile) + " Бонус за купленный билет");
    }
}