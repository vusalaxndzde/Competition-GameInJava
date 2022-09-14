package service.menu;

import bean.Config;
import service.inter.menu.MenuLoginServiceInter;
import util.InputUtil;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void process() {
        System.out.println("Login:");
        String username = InputUtil.nextLine("Username: ");
        String password = InputUtil.nextLine("Password: ");

        if (username.equals("vusal") && password.equals("1234")) {
            Config.setLogged(true);
            System.out.println("Login successfully.");
        } else {
            Config.increaseTrying();
            System.out.println("Invalid username or password!");
            if (Config.getTrying() == 3) {
                System.out.println("You banned!");
                System.exit(0);
            }
        }
    }
}
