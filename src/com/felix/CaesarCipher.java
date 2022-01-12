package com.felix;

import java.util.Locale;

public class CaesarCipher {
    public String encrypt(String plainText, int shift) {
        plainText = plainText.toLowerCase(Locale.ROOT);
        String cipherText = "";

        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                cipherText += ' ';
                continue;
            }

            char c = (char) (plainText.charAt(i) + shift);

            if (c > 'z')
                cipherText += (char) (plainText.charAt(i) - (26-shift));
            else
                cipherText += (char) (plainText.charAt(i) + shift);
        }

        return cipherText;
    }

    public String decrypt(String cipherText, int shift) {
        cipherText = cipherText.toLowerCase(Locale.ROOT);
        String plainText = "";

        for (int i = 0; i < cipherText.length(); i++) {
            if (cipherText.charAt(i) == ' ') {
                plainText += ' ';
                continue;
            }

            char c = (char) (cipherText.charAt(i) - shift);

            if (c < 'a')
                plainText += (char) (cipherText.charAt(i) + (26-shift));
            else
                plainText += (char) (cipherText.charAt(i) - shift);
        }

        return plainText;
    }
}
