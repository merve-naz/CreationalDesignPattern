package org.mervenaz.factorymethod;

public class NormalUser implements User {
    @Override
    public void accessSystem() {
        System.out.println("Kullanıcı yetkileriyle sisteme erişildi.");
    }
}