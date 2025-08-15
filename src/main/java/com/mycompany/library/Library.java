
package com.mycompany.library;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Library {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Librarian librarian = new Librarian(1, "Admin", "01970052671");
        LibrarySystem library = new LibrarySystem(librarian);

        while (true) {
            System.out.println("\n===================================");
            System.out.println("\n===> Library Management System <===");
            System.out.println("\n===================================");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();
                    librarian.addBook(library, new Book(bookId, title, author, category));
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    library.registerMember(new Member(memberId, name, phone));
                    break;

                case 3:
                    System.out.print("Enter Member ID: ");
                    memberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    title = sc.nextLine();
                    Member member = library.getMemberById(memberId);
                    Book bookToBorrow = library.findBookByTitle(title);
                    if (member != null && bookToBorrow != null) {
                        member.borrowBook(bookToBorrow);
                    }
                    break;

                case 4:
                    System.out.print("Enter Member ID: ");
                    memberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    title = sc.nextLine();
                    member = library.getMemberById(memberId);
                    Book bookToReturn = library.findBookByTitle(title);
                    if (member != null && bookToReturn != null) {
                        member.returnBook(bookToReturn);
                    }
                    break;

                case 5:
                    library.displayAllBooks();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
