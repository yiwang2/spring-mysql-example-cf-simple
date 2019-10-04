package io.pivotal.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.domain.Book;
import io.pivotal.repository.BookRepository;


@RestController
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> getBooks() {
		List<Book> bookResults = new ArrayList<Book>();
		
		Iterator<Book> bookIterator =  bookRepository.findAll().iterator();
		while (bookIterator.hasNext()) {
			bookResults.add(bookIterator.next());
		}
		
		return bookResults;
	}
	
	@RequestMapping(value = "/books", method = RequestMethod.POST)
	@Transactional
	public void addBook(@RequestBody Book book) {
		bookRepository.save(book);
		
	}
	
}
