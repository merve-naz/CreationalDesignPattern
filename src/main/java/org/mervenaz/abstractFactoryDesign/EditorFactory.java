package org.mervenaz.abstractFactoryDesign;

public class EditorFactory extends AbstractUserFactory {
    @Override
    public User createUser(UserProfile userProfile) {
        return new Editor(userProfile);
    }
}