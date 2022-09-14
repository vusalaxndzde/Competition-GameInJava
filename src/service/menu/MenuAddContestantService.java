package service.menu;

import bean.Config;
import bean.Contestant;
import service.inter.menu.MenuAddContestantServiceInter;
import util.InputUtil;

public class MenuAddContestantService implements MenuAddContestantServiceInter {
    @Override
    public void process() {
        if (Config.getContestants() != null) {
            Contestant contestant = Config.fillContestant();
            Config.appendContestant(contestant);
            System.out.println("Contestant added.");
        } else {
            System.out.println("You can use this feature after registering the contestants.");
        }
    }
}
