package org.mervenaz.abstractFactoryDesign;


public class Main {
    public static void main(String[] args) {
        // Admin: flag = isSuperUser
        AbstractUserFactory adminFactory = new AdminFactory();
        User admin = adminFactory.createUser(new UserProfile("mervenaz", true));
        admin.getRole();

        // NormalUser: flag = isVerified
        AbstractUserFactory userFactory = new NormalUserFactory();
        User user = userFactory.createUser(new UserProfile("alya", true));
        user.getRole();

        // Editor: flag = canPublish
        AbstractUserFactory editorFactory = new EditorFactory();
        User editor = editorFactory.createUser(new UserProfile("sevgi", true));
        editor.getRole();
    }
}