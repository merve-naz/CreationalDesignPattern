package org.mervenaz.factoryDesign;

public class Admin implements User {
    @Override
    public void accessSystem() {
        System.out.println("Admin yetkileriyle sisteme erişildi.");
    }
}