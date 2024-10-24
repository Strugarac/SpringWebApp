package kosta.springframework.spring6webapp.services;

import kosta.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
