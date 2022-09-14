package service.menu;

import bean.Config;
import bean.Contestant;
import service.inter.menu.MenuRegisterContestantInter;
import util.InputUtil;

public class MenuRegisterContestantService implements MenuRegisterContestantInter {
    @Override
    public void process() {
        System.out.println("Registration:");
        int count = InputUtil.nextInt("How many people will participate in the competition? - ");

        Contestant[] contestants = new Contestant[count];

        for (int i = 0; i < contestants.length; i++) {
            Contestant contestant = Config.fillContestant();
            contestants[i] = contestant;
        }

        Config.setContestants(contestants);
        System.out.println("Contestants was registered.");
    }
}
