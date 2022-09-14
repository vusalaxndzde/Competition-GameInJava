package service.menu;

import service.inter.menu.MenuUnknownServiceInter;

public class MenuUnknownService implements MenuUnknownServiceInter {
    @Override
    public void process() {
        System.out.println("Unknown menu!");
    }
}
