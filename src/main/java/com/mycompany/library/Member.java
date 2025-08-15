
package com.mycompany.library;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {
     int memberId;
     String name;
     String phone;
     List<Book> borrowedBooks = new ArrayList<>();

    public Member(int memberId, String name, String phone) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            System.out.println("This book is not available right now.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
        } else {
            System.out.println("You don't have this book borrowed.");
        }
    }

    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name + ", Phone: " + phone);
    }
}
