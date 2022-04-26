package dzcorp.openapi.controller;

import dzcorp.openapi.api.LibraryApi;
import dzcorp.openapi.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("the amazing spriderman");
        book1.setBookAuthor("dimas adriyantos");
        books.add(book1);

        Book book2 = new Book();
        book2.setName("Toy story");
        book2.setBookAuthor("Woody");
        books.add(book2);

        return new ResponseEntity<>(books, HttpStatus.OK);
    }


}
