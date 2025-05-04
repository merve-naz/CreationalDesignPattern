package org.mervenaz.abstractFactoryDesign;


public class NormalUser implements User {
    private String name;
    private boolean isVerified;

    public NormalUser(UserProfile userProfile) {
        this.name = userProfile.getName();
        this.isVerified = userProfile.getFlag();
    }

    @Override
    public void getRole() {
        System.out.println("NormalUser: " + name + ", Verified: " + isVerified);
    }
}