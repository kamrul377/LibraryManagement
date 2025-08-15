
package com.mycompany.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Librarian {
     int employeeId;
     String name;
     String phone;

    public Librarian(int employeeId, String name, String phone) {
        this.employeeId = employeeId;
        this.name = name;
        this.phone = phone;
    }

    public void addBook(LibrarySystem library, Book book) {
        library.getBooks().add(book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(LibrarySystem library, int bookId) {
        library.getBooks().removeIf(book -> book.getBookId() == bookId);
        System.out.println("Book removed successfully.");
    }
}
