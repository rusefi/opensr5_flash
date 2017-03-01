package com.rusefi;

public class Main {

    public static void main(String[] args) {
        System.out.println("OpenSR5 - load/program tune via serial port utility");
        System.out.println("  (c) 2017 Andrey Belomutskiy");
        System.out.println("  https://github.com/rusefi/opensr5_flash");
        System.out.flush();

        if (args.length < 1) {
            System.err.println("Usage:");
            System.err.println("opensr5 DEFINITION_FILE.INI");
            System.exit(-1);
        }

        String projectIniFileName = args[0];

    }
}
