package org.mervenaz.PrototypeDesign;

public class Document implements Cloneable {
    private String title;
    private String content;
    private Author author; // Referans tipli alan

    public Document(String title, String content, Author author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // Deep copy için hem Document hem Author klonlanır
    @Override
    public Document clone() {
        try {
            // super.clone(), Object sınıfından gelen clone() metodunu çağırarak bu nesnenin birebir kopyasını üretir.
            // Bu metot Object döndürdüğü için, sonucu Document tipine dönüştürmemiz gerekir (type cast).
            // Böylece orijinal nesneye ait tüm alanlar yeni kopyaya aktarılmış olur (shallow copy).
            Document copy = (Document) super.clone();
            copy.author = this.author.clone(); // <-- işte burası deep copy kısmı
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void print() {
        System.out.println("Başlık: " + title);
        System.out.println("İçerik: " + content);
        System.out.println("Yazar: " + author.getName());
    }

    public Author getAuthor() {
        return author;
    }
}
