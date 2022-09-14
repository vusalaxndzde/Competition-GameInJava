package util;

import bean.Config;
import service.inter.Process;
import service.menu.*;

public enum Menu {

    LOGIN("Login", new MenuLoginService()),
    REGISTER_CONTESTANT(1, "Register contestants", new MenuRegisterContestantService()),
    SHOW_ALL_CONTESTANT(2, "Show all contestants", new MenuShowContestantService()),
    ADD_CONTESTANT(3, "Add contestant", new MenuAddContestantService()),
    START_CONTEST(4, "Start contest", new MenuStartContestService()),
    LOGOUT(5, "Logout", new MenuLogoutService()),
    EXIT(6, "Exit", new MenuExitService()),
    UNKNOWN(new MenuUnknownService());

    private int number;
    private String label;
    private Process service;

    Menu() {
    }

    Menu(Process service) {
        this.service = service;
    }

    Menu(String label, Process service) {
        this.label = label;
        this.service = service;
    }

    Menu(int number, String label, Process service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    @Override
    public String toString() {
        return number + ". " + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public static void showAllMenu() {
        if (!Config.isLogged()) {
            LOGIN.process();
        } else {
            System.out.println("Menus:");
            Menu[] menus = Menu.values();
            for (int i = 1; i < menus.length; i++) {
                if (menus[i] != UNKNOWN) {
                    System.out.println(menus[i]);
                }
            }
        }
    }

    public static Menu find(int selectedNumber) {
        Menu[] menus = Menu.values();
        for (int i = 1; i < menus.length; i++) {
            if (menus[i].number == selectedNumber) {
                return menus[i];
            }
        }
        return UNKNOWN;
    }

}
