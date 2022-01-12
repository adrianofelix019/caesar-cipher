package com.felix;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static int shift;
    private static String text;
    private static int option;
    private static CaesarCipher cc = new CaesarCipher();

    public static void main(String[] args) {
        showMenu();
        do {
            switch (option) {
                case 1:
                    encryptOption();
                    System.out.println();
                    showMenu();
                    break;
                case 2:
                    decryptOption();
                    System.out.println();
                    showMenu();
                    break;
                case 3:
                    System.out.println("Exiting...");
            }
        } while (option != 3);
    }

    private static void showMenu() {
        System.out.println("[1] - Encrypt text");
        System.out.println("[2] - Decrypt text");
        System.out.println("[3] - Exit");
        System.out.print("Option: ");
        option = in.nextInt();
    }

    private static void encryptOption() {
        System.out.print("Enter the shift: ");
        shift = in.nextInt();
        in.nextLine();
        System.out.print("Enter the text to encrypt:");
        text = in.nextLine();
        System.out.println("Your encrypted text is:");
        System.out.println(cc.encrypt(text, shift));
    }

    private static void decryptOption() {
        System.out.print("Enter the shift: ");
        shift = in.nextInt();
        in.nextLine();
        System.out.print("Enter the text to decrypt:");
        text = in.nextLine();
        System.out.println("Your encrypted text is:");
        System.out.println(cc.decrypt(text, shift));
    }
}
