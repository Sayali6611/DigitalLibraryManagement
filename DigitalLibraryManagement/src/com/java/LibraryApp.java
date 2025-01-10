package com.java;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();
        User user = new User();

        System.out.println("Welcome to the Library Management System");
        System.out.println("1. Admin Page");
        System.out.println("2. User Page");

        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.println("Admin Page");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            int adminChoice = sc.nextInt();
            sc.nextLine();

            if (adminChoice == 1) {
                System.out.println("Enter book title: ");
                String title = sc.nextLine(); 

                System.out.println("Enter author: ");
                String author = sc.nextLine();

                System.out.println("Enter category: ");
                String category = sc.nextLine(); 

                admin.AddBook(title, author, category); 
            } else if (adminChoice == 2) {
                admin.viewBooks();
            }
        } else if (choice == 2) {
            System.out.println("User Page");
            System.out.println("Search title: ");
            String title = sc.nextLine(); 
            user.SearchBook(title);
        }
             sc.close();
    }
}


