
package com.mycompany.library;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
     List<Book> books = new ArrayList<>();
     List<Member> members = new ArrayList<>();
     Librarian librarian;

    public LibrarySystem(Librarian librarian) {
        this.librarian = librarian;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered successfully.");
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        for (Book b : books) {
            b.displayInfo();
        }
    }

    public Member getMemberById(int memberId) {
        for (Member m : members) {
            if (m.memberId == memberId) { 
                return m;
            }
        }
        System.out.println("Member not found.");
        return null;
    }
}
