
package com.mycompany.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Book {
     int bookId;
     String title;
     String author;
     String category;
     boolean isAvailable;

    public Book(int bookId, String title, String author, String category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry! Book is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }

    public void displayInfo() {
        System.out.printf("# %d | Name:%s  Author:%s  Category:[%s]  Status:%s\n",
                bookId, title, author, category, isAvailable ? "Available" : "Borrowed");
    }    
}
