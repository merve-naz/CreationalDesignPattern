package org.mervenaz.singleton;



public class EagerLogger {
    // 1. Nesne doğrudan burada oluşturuluyor (Eager Initialization)
    private static final EagerLogger instance = new EagerLogger();

    // 2. Constructor private — dışarıdan new ile nesne oluşturulamasın
    private EagerLogger() {
        System.out.println("Logger nesnesi oluşturuldu.");
    }

    // 3. Her yerden erişim için global erişim noktası
    public static EagerLogger getInstance() {
        return instance;
    }

    // 4. Kullanılacak metod
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
