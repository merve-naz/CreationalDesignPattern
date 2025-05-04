package org.mervenaz.factoryDesign;

public class Main {
    public static void main(String[] args) {
        User admin = UserFactory.createUser("admin");
        admin.accessSystem(); // Admin yetkileriyle sisteme erişildi.

        User editor = UserFactory.createUser("editor");
        editor.accessSystem(); // Editor yetkileriyle içeriğe erişildi.

        User user = UserFactory.createUser("user");
        user.accessSystem(); // Kullanıcı yetkileriyle sisteme erişildi.
    }
}