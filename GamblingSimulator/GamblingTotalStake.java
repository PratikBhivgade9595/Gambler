package GamblingSimulator;

public class GamblingTotalStake {
    public static void main(String[] args) {
        System.out.println("Welcome To Gambling Stimulator");

        int stake = 100;
        int bet = 1;

        System.out.println("Person Having Stack :" + stake + "$");
        System.out.println("Person Betting Every Game :" + bet + "$");

        while (stake <= 150 && stake >= 50) {
            int betPrice = (int) Math.floor(Math.random() * 10) % 2;
            if (betPrice == 1) {
                System.out.println("Won He Get :" + betPrice + "$");
                stake++;
                System.out.println("Total stake :" + stake);
            } else {
                System.out.println("loose He Get:" + betPrice + "$");
                stake--;
                System.out.println("Total stake :" + stake);
            }
        }
        int totalStake = stake;
        System.out.println("Total Stake For Resign A Day is :" + totalStake);
    }
}



