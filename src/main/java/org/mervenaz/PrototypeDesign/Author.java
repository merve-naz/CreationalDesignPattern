package org.mervenaz.PrototypeDesign;

public class Author implements Cloneable {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    // Getter ve Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Author clone() {
        try {
            Author clone = (Author) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
