package org.mervenaz.singleton;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            EnumLogger logger = EnumLogger.INSTANCE;
            System.out.println(Thread.currentThread().getName() + " - EnumLogger Instance: " + logger.hashCode()+ "enum name: " +logger.name() );
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}