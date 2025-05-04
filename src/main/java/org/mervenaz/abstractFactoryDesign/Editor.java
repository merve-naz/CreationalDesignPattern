package org.mervenaz.abstractFactoryDesign;

public class Editor implements User {
    private final String name;
    private final boolean canPublish;

    public Editor (UserProfile profile) {
        this.name = profile.getName();
        this.canPublish = profile.getFlag();
    }

    @Override
    public void getRole() {
        System.out.println("Editor: " + name + ", Super User: " + canPublish);
    }
}