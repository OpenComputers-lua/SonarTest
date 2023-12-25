package org.example;

import java.util.logging.*;
public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class.getName());
        StrBuilder sb = new StrBuilder(StrBuilder.LETTERS, 5);
        for(int i = 0; i < 10000; i++) {
            sb.increment();
            log.info(String.valueOf(sb.getReversed()));
        }
    }
}