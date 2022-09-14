package service.menu;

import bean.Config;
import bean.Contestant;
import service.inter.menu.MenuShowContestantServiceInter;

public class MenuShowContestantService implements MenuShowContestantServiceInter {
    @Override
    public void process() {
        Contestant[] contestants = Config.getContestants();
        if (contestants != null) {
            for (int i = 0; i < contestants.length; i++) {
                System.out.println((i + 1) + ". " + contestants[i].toString());
            }
        } else {
            System.out.println("No one is registered.");
        }
    }
}
