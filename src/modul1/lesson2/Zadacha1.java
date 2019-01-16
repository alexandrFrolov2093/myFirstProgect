package modul1.lesson2;

public class Zadacha1 {
    public static void main(String[] args) {
        int cash = 100;
        int toyCost = 52;
        int boobleCost = 10;
        int candyCost = 1;

        int countToyBuy = cash / toyCost;
        int restAfterToysBuy = cash - (countToyBuy * toyCost);

        int countBooble = restAfterToysBuy / boobleCost;
        int restAfterBoobleBuy = restAfterToysBuy - (countBooble * boobleCost);

        int countCandy = restAfterBoobleBuy / candyCost;
        int restAfterCandyBuy = restAfterBoobleBuy - (countCandy * candyCost);

        System.out.println(countToyBuy);
        System.out.println(countBooble);
        System.out.println(countCandy);
        System.out.println(restAfterCandyBuy);
    }
}
