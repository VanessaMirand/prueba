package DigitalLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    public String title;
    public String author;
    public boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void lend() {
        available = false;
    }

    public void give_back() {
        available = true;
    }

    public void showInformation() {
        System.out.println("Titulo: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Disponible: " + (available ? "si" : "no"));
    }
}
class Library{
    Scanner scanner = new Scanner (System.in);
    public List<Book> collection;

    public Library(){
        collection = new ArrayList<>();
    }
    public void add_book(Book book){
        collection.add(book);
        System.out.println("Libro agregado: " + book.getTitle());
    }
    public void lend_Book(String title){
        System.out.println("Ingrese el titulo de un libro a prestar: ");
        title = scanner.nextLine();
        for (Book book : collection){
            if (book.getTitle().equalsIgnoreCase(title)){
                if (book.isAvailable()) {
                    book.lend();
                    System.out.println("Libro prestado: " + title);
                }
                else {
                    System.out.println("El libro " + title + " no esta disponible.");
                }
                return;
            }

        }
        System.out.println("El libro " + title + " no se encontro en la biblioteca");
    }
    public void return_book(String title){
        System.out.println("Ingrese el titulo de un libro a devolver: ");
        title = scanner.nextLine();
        for (Book book : collection){
            if (book.getTitle().equalsIgnoreCase(title)){
                if (!book.isAvailable()){
                    book.give_back();
                    System.out.println("Libro devuelto: " + title);
                }else {
                    System.out.println("El libro " +  title + " ya estaba disponible.");
                }
                return;
            }
        }
        System.out.println("El libro " + title + " no se encontro en la biblioteca.");
    }
    public void search_books(String check) {


        System.out.println("Para buscar un libro, ingrese el titulo o el autor de un libro:");
        check = scanner.nextLine();
        System.out.println("Resultados de la busqueda para: " + check);
        boolean founded = false;
        for (Book book : collection) {
            if (book.getTitle().equalsIgnoreCase(check) || book.getAuthor().equalsIgnoreCase(check)) {
                book.showInformation();
                founded = true;
            }
        }
        if (!founded) {
            System.out.println("No se encontraron libros que coincidan con la consulta.");
        }
    }

}