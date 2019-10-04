package io.pivotal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.pivotal.domain.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, String>{

}
