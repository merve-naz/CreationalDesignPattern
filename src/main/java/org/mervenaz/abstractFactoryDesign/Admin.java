package org.mervenaz.abstractFactoryDesign;

public class Admin implements User {


        private final String name;
        private final boolean isSuperUser;

        public Admin(UserProfile profile) {
            this.name = profile.getName();
            this.isSuperUser = profile.getFlag();
        }

        @Override
        public void getRole() {
            System.out.println("Admin: " + name + ", Super User: " + isSuperUser);
        }

}