package com.felix;

import java.util.Scanner;

public class Menu {
    private int option;
    private String[] options;
    private Scanner in = new Scanner(System.in);
    Menu(String[] options) {
        this.options = options;
    }

    public void mainLoop() {
        while (this.option != 0) {
            showMenu();
            getOptionFromUser();
        }
    }

    private void showMenu() {
        for (int i = 0; i < options.length;i++) {
            System.out.printf("[%d] - %s\n", i, options[i]);
        }
        System.out.println("[0] - Exit");
    }

    private void getOptionFromUser() {
        System.out.println("Option: ");
        this.option = in.nextInt();
        in.nextLine();
        in.close();
    }
}
