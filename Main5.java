/*Library Management System

Classes:

Book
Library
Member

Functions:

Issue Book
Return Book
Display Books

Concept: Object Interaction */
class Book {
    String title;
    boolean isIssued=false;
    Book(String title) {
        this.title=title;
    }
}
class Member {
    String name;
    Member(String name) {
        this.name=name;
    }
}
class Library {
    void issueBook(Book book, Member member) {
        if (!book.isIssued) {
            book.isIssued=true;
            System.out.println(member.name+"issued the book:"+book.title);
        } 
        else {
            System.out.println("Book is already issued.");
        }
    }
    void returnBook(Book book, Member member) {
        if (book.isIssued) {
            book.isIssued=false;
            System.out.println(member.name +"returned the book:"+ book.title);
        } 
        else {
            System.out.println("Book was not issued.");
        }
    }
    void displayBook(Book book) {
        System.out.println("Book: "+book.title);

        if (book.isIssued) {
            System.out.println("Status:Issued");
        } 
        else {
            System.out.println("Status:Available");
        }
    }
}
public class Main5 {
    public static void main(String[] args) {
         Book book=new Book("Java Programming");
        Member member=new Member("Dhaniya");
        Library library=new Library();
        library.displayBook(book);
        library.issueBook(book, member);
        library.displayBook(book);
        library.returnBook(book, member);
        library.displayBook(book);
    }
    
}
