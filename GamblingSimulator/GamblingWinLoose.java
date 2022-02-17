package GamblingSimulator;

public class GamblingWinLoose {
    public static void main(String[] args) {
        System.out.println("Welcome To Gambling Stimulator");

        int stake = 100;
        int bet = 1;

        System.out.println("Person Having Stack :" + stake + "$");
        System.out.println("Person Betting Every Game :" + bet + "$");

        int betPrice = (int) Math.floor(Math.random() * 10) % 2;
        if (betPrice == 1) {
            System.out.println("Won He Get :" + betPrice + "$");
        } else {
            System.out.println("loose He Get:" + betPrice + "$");
        }
    }
}
