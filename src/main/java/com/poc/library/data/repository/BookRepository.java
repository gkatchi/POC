package com.poc.library.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.library.data.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	Book findByTitle(String title);

	

}
