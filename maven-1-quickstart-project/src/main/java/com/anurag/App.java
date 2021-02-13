package com.anurag;

import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public App() {

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        if (args.length < 1) {
            System.err.println("please provide an input");
            System.exit(1);
        }
        System.out.println(sha256hex(args[0]));

    }

    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
