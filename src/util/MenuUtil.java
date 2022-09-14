package util;

public class MenuUtil {

    public static void showMenu() {

        Menu.showAllMenu();

        int selectedNumber = InputUtil.nextInt("Please select menu: ");
        Menu selectedMenu = Menu.find(selectedNumber);
        selectedMenu.process();

    }

}
