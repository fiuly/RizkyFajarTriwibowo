package com.libraryapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Perpustakaan Kota");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("=== " + library.getName() + " ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            String input = scanner.nextLine();
            int choice = -1;
            try {
                choice = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Input bukan angka");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Judul: ");
                    String title = scanner.nextLine();
                    System.out.print("Penulis: ");
                    String author = scanner.nextLine();
                    System.out.print("Tahun: ");
                    String yearStr = scanner.nextLine();
                    int year;
                    try {
                        year = Integer.parseInt(yearStr.trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Tahun tidak valid, menggunakan 0");
                        year = 0;
                    }
                    Book book = new Book(title, author, year);
                    boolean added = library.addBook(book);
                    if (added) {
                        System.out.println("Buku ditambahkan");
                    } else {
                        System.out.println("Perpustakaan penuh");
                    }
                    break;
                case 2:
                    library.showBooks();
                    break;
                case 3:
                    System.out.print("Kata kunci: ");
                    String keyword = scanner.nextLine();
                    Book found = library.searchBook(keyword);
                    if (found != null) {
                        System.out.println("Ditemukan: " + found.getTitle() + " oleh " + found.getAuthor() + " (" + found.getYear() + ")");
                    } else {
                        System.out.println("Tidak ditemukan");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor buku yang ingin dihapus: ");
                    String idxStr = scanner.nextLine();
                    try {
                        int idx = Integer.parseInt(idxStr.trim());
                        boolean removed = library.removeBook(idx - 1);
                        if (removed) {
                            System.out.println("Buku dihapus");
                        } else {
                            System.out.println("Nomor tidak valid");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input bukan angka");
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
        scanner.close();
    }
}
