package org.mervenaz.factoryDesign;


public class Editor implements User {
    @Override
    public void accessSystem() {
        System.out.println("Editor yetkileriyle içeriğe erişildi.");
    }
}