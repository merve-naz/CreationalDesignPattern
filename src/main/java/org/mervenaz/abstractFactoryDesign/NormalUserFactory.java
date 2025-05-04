package org.mervenaz.abstractFactoryDesign;

public class NormalUserFactory extends AbstractUserFactory {
    @Override
    public User createUser(UserProfile userProfile) {
        return new NormalUser(userProfile);
    }
}