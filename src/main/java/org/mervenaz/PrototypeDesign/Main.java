package org.mervenaz.PrototypeDesign;

public class Main {
    public static void main(String[] args) {
        // Orijinal nesneler
        long newStart = System.nanoTime();
        Author originalAuthor = new Author("Merve");
        Document originalDoc = new Document("Başlık", "İçerik", originalAuthor);
        long newEnd = System.nanoTime();

        // clone süresi
        long cloneStart = System.nanoTime();
        Document clonedDoc = originalDoc.clone();
        long cloneEnd = System.nanoTime();

        // Süre karşılaştırması
        System.out.println("clone() süresi: " + (cloneEnd - cloneStart) + " ns");
        System.out.println("new    süresi: " + (newEnd - newStart) + " ns");

        // Referans karşılaştırması
        System.out.println("\nAuthor referansları aynı mı?");
        System.out.println("Original vs Clone: " + (originalDoc.getAuthor() == clonedDoc.getAuthor())); // false olmalı
    }
}

