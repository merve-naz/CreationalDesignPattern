package org.mervenaz.abstractFactoryDesign;

public class UserProfile {
    private String name;
    private boolean flag;

    public UserProfile(String name, boolean flag) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public boolean getFlag() {
        return flag;
    }
}