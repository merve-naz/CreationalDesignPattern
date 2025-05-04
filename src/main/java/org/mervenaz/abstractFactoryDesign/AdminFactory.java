package org.mervenaz.abstractFactoryDesign;

public class AdminFactory extends AbstractUserFactory {
    @Override
        public User createUser(UserProfile userProfile) {
            return new Admin(userProfile);
        }
}
