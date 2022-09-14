package bean;

import util.InputUtil;

public class Config {

    private static boolean logged = false;
    private static int trying = 0;
    private static Contestant[] contestants;

    public static Contestant[] getContestants() {
        return contestants;
    }

    public static void setContestants(Contestant[] contestants) {
        Config.contestants = contestants;
    }

    public static boolean isLogged() {
        return logged;
    }

    public static void setLogged(boolean logged) {
        Config.logged = logged;
    }

    public static int getTrying() {
        return trying;
    }

    public static void setTrying(int trying) {
        Config.trying = trying;
    }

    public static void increaseTrying() {
        trying++;
    }

    public static Contestant fillContestant() {
        String username = InputUtil.nextLine("Username: ");
        String name = InputUtil.nextLine("Name: ");
        String surname = InputUtil.nextLine("Surname: ");
        int age = InputUtil.nextInt("Age: ");

        return new Contestant(username, name, surname, age);
    }

    public static void appendContestant(Contestant contestant) {
        Contestant[] newContestants = new Contestant[contestants.length + 1];
        for (int i = 0; i < contestants.length; i++) {
            newContestants[i] = contestants[i];
        }
        newContestants[newContestants.length - 1] = contestant;
        contestants = newContestants;
    }
}
