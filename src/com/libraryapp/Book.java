package com.libraryapp;

public class Book {
    private String title;
    private String author;
    private int year;
    public static final String CATEGORY = "Literatur";

    public Book(String title, String author, int year) {
        if (title == null) {
            this.title = "";
        } else {
            this.title = title.trim();
        }
        if (author == null) {
            this.author = "";
        } else {
            this.author = author.trim();
        }
        this.year = year;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public char getInitial() {
        if (title.length() == 0) {
            return '?';
        }
        return Character.toUpperCase(title.charAt(0));
    }

    public boolean containsKeyword(String keyword) {
        if (keyword == null) {
            return false;
        }
        return title.toLowerCase().contains(keyword.toLowerCase()) || author.toLowerCase().contains(keyword.toLowerCase());
    }
}
