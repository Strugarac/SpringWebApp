package kosta.springframework.spring6webapp.services;

import kosta.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
