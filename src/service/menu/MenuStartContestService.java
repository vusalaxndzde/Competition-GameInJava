package service.menu;

import bean.Config;
import bean.Contestant;
import service.inter.menu.MenuStartContestInter;
import util.InputUtil;

import java.util.Random;

public class MenuStartContestService implements MenuStartContestInter {
    @Override
    public void process() {
        Contestant[] contestants = Config.getContestants();
        if (contestants != null) {
            Random r = new Random();
            System.out.println("The system selected the number.");
            int randomNumber = r.nextInt(1, contestants.length + 1);

            int guessedNumber = InputUtil.nextInt("Guess who was chosen: ");
            if (guessedNumber == randomNumber) {
                System.out.println("Chosen person:");
                System.out.println(Config.getContestants()[randomNumber - 1]);
                System.out.println("Congratulations you won!");
            } else {
                System.out.println("You failed!");
            }
        } else {
            System.out.println("The contest could not be started! Because no one is registered.");
        }
    }
}
