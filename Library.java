//Ian Kobi
//CSC210 W 4:00pm-6:45pm
//Project 4 SFSU Library

public class Library extends Book{

    static String hours = "8am to 7pm";
    static Book[] Library = new Book[5];
    static String address = "1630 Holloway Ave, San Francisco, CA 94132";
    int counter = 1;

    Library(){}

    Library(String name){}

    public static void main (String[] args){
//Create one Library
        Library SFSULibrary = new Library("J.Paul Leonard Library");


//Add five books to the SFSU library
    SFSULibrary.addBook(new Book("Introduction to Java Programming","Daniel Liang"));
    SFSULibrary.addBook(new Book("Data Structures and Abstractions with Java", "Frank M. Carrano"));
    SFSULibrary.addBook(new Book("A Tale of Two Cities", "Charles Dickens"));
    SFSULibrary.addBook(new Book("Sapiens", "Yuval Noah Harari"));
    SFSULibrary.addBook(new Book("Calculus", "James Stewart"));

//Print opening hours and the address
        System.out.print("Library hours: ");
        printOpeningHours();
        System.out.println();
        System.out.print("Library address: ");
        printAddress();

//Try to borrow Sapiens from the library
        System.out.print("Borrowing Sapiens: ");
        Library[3].borrowBook("Sapiens");
        Library[3].borrowBook("Sapiens");
        SFSULibrary.borrowBook("Pride and Prejudice");

//Print the titles of all available books in the library
        System.out.println("Books available in the SFSU library: ");
        printAvailableBooks();

//Return Sapiens to the SFSU library
        System.out.print("Returning Sapiens: ");
        Library[3].returnBook("Sapiens");

//Print the titles of available from the SFSU library
        System.out.println("Books available in the SFSU Library: ");
        printAvailableBooks();
    }



    public void addBook(Book book){

    for(int i =0; i<counter; i+=counter) {
        Library[counter-1] = book;
        }
    counter++;
    }

    static public void printOpeningHours(){
        System.out.print("Library is open daily from "+hours);
    }

    static public void printAddress(){
        System.out.println(address);
    }

    static public void printAvailableBooks(){
        for(int i=0; i<Library.length;i++){
            if (Library[i].borrowed==false)
            System.out.println("    "+Library[i].getTitle());
        }
    }

}







