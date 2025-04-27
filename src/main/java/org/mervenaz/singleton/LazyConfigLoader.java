package org.mervenaz.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LazyConfigLoader {
    private static LazyConfigLoader instance;
    private Properties properties;

    private LazyConfigLoader() {
        System.out.println("Config dosyası yükleniyor...");
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Config dosyası yüklenemedi", e);
        }
    }

    // synchronized → böylece çoklu thread ortamında iki kere oluşma riski yok
    public static synchronized LazyConfigLoader getInstance() {
        if (instance == null) {
            instance = new LazyConfigLoader();
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
