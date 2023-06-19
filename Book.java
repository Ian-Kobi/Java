public class Book{

    private String title;
    private String author;
    boolean borrowed;
    static int count;

    Book() {
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        boolean borrowed;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setInfo("Introduction to Java Programming", "Daniel Liang");
        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);
        System.out.println("Book available? : " + b1.borrowBook(b1.title));
        System.out.println("Book ready to return? : " + b1.returnBook(b1.getTitle()));
        System.out.println("How many times book has been borrowed: " + count);
//        Book b2 = new Book();
//        b2.setInfo("Data Structures and Abstractions with Java", "Frank M. Carrano");
//        System.out.println("Title: " + b2.title);
//        System.out.println("Author: " + b2.author);
//        System.out.println("Book available?: " + b2.borrowBook(b1.title));
//        System.out.println("Book ready to return? : " + b2.returnBook(b1.getTitle()));
//        System.out.println("How many times book has been borrowed: " + count);
    }

    //Method to find out if book is available


    public boolean borrowBook(String title) {
        switch(title){
            case("Introduction to Java Programming"):
            case("Data Structures and Abstractions with Java"):
            case("A Tale of Two Cities"):
            case("Sapiens"):
            case("Calculus"):
                if(!borrowed){
                    System.out.println("You successfully borrowed "+title);
                count = count+1;
                borrowed = true;}
                else
                    System.out.println("Sorry, this book is already borrowed.");
                break;
            default:
                System.out.println("Sorry, this book is not in our catalog");
                break;
        }
        return borrowed;
    }

    public boolean returnBook(String title) {
        switch(title){
            case("Introduction to Java Programming"):
            case("Data Structures and Abstractions with Java"):
            case("A Tale of Two Cities"):
            case("Sapiens"):
            case("Calculus"):
                if(borrowed){
                    System.out.println("You successfully returned "+title);
                    borrowed =false;}
                else
                    System.out.println("Sorry, this book is already in our library.");
                break;
            default:
                System.out.println("Sorry, this book is not offered at our library");
                break;
        }
        return borrowed;
    }

    public void setInfo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }


}
