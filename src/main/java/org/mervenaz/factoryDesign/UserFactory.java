package org.mervenaz.factoryDesign;

public class UserFactory {
    public static User createUser(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Kullanıcı tipi null olamaz.");
        }
        return switch (type.toLowerCase()) {
            case "admin" -> new Admin();
            case "user" -> new NormalUser();
            case "editor" -> new Editor();
            default -> throw new IllegalArgumentException("Bilinmeyen kullanıcı tipi: " + type);
        };
    }
}