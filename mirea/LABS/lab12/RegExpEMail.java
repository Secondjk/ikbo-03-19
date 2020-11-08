package ru.mirea.labs.lab12;

import java.util.regex.Pattern;

public class RegExpEMail {
    public static void main(String[] args) {
        Pattern pattern = Pattern
                .compile("/^([A-Z|a-z|0-9](\\.|_){0,1})+[A-Z|a-z|0-9]\\@([A-Z|a-z|0-9])+((\\.){0,1}[A-Z|a-z|0-9]){2}\\.[a-z]{2,3}$/gm");
        String input = args.length == 0 ? "invalid E-Mail" : args[0];

        boolean result = pattern.matcher(input).matches();
        System.out.println(result);
    }
}
