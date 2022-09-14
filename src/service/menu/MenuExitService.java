package service.menu;

import service.inter.menu.MenuExitServiceInter;

public class MenuExitService implements MenuExitServiceInter {
    @Override
    public void process() {
        System.exit(0);
    }
}
