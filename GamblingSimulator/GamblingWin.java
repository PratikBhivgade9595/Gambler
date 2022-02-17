package GamblingSimulator;

public class GamblingWin {
    public static int stake = 100;
    public  void gambler() {
        System.out.println("Welcome To Gambling Stimulator");

        int totalStake = 0;
        int bet = 1;

        System.out.println("Person Having Stack :" + stake + "$");
        System.out.println("Person Betting Every Game :" + bet + "$");

        for (int i = 1; i < 5; i++) {
            while (stake < 150 && stake > 96) {
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
            if (stake == 96){
                System.out.println("Resign for a day");
            }else if (stake == 150){
                System.out.println("Resign for a day");
            }
            totalStake = totalStake + stake;
            System.out.println("Total Stake is :" + totalStake + "$");
        }
    }

    public static void main(String[] args) {
        GamblingWin obj = new GamblingWin();
        obj.gambler();
    }
}
