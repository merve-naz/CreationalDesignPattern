package org.mervenaz.singleton;

public enum EnumLogger {
    INSTANCE;

     EnumLogger() {
        System.out.println("Logger nesnesi oluşturuldu.");
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

