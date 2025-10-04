package com.libraryapp;

public class Library {
    private String name;
    private Book[] books;
    private int count;
    public static int totalLibraries = 0;

    public Library(String name) {
        this.name = name;
        this.books = new Book[100];
        this.count = 0;
        totalLibraries++;
    }

    public String getName() {
        return name;
    }

    public boolean addBook(Book book) {
        if (count >= books.length || book == null) {
            return false;
        }
        books[count++] = book;
        return true;
    }

    public void showBooks() {
        if (count == 0) {
            System.out.println("Belum ada buku");
            return;
        }
        for (int i = 0; i < count; i++) {
            Book b = books[i];
            System.out.println((i + 1) + ". " + b.getTitle() + " - " + b.getAuthor() + " (" + b.getYear() + ") Initial: " + b.getInitial());
        }
    }

    public Book searchBook(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return null;
        }
        for (int i = 0; i < count; i++) {
            if (books[i].containsKeyword(keyword)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean removeBook(int index) {
        if (index < 0 || index >= count) {
            return false;
        }
        for (int i = index; i < count - 1; i++) {
            books[i] = books[i + 1];
        }
        books[count - 1] = null;
        count--;
        return true;
    }
}
