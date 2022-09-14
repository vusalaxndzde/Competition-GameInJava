package service.menu;

import bean.Config;
import service.inter.menu.MenuLogoutServiceInter;
import util.InputUtil;

public class MenuLogoutService implements MenuLogoutServiceInter {
    @Override
    public void process() {
        String isExit = InputUtil.nextLine("Are you sure to exit? y/n - ");
        if (isExit.equals("y")) {
            Config.setLogged(false);
            Config.setTrying(0);
        }
    }
}
