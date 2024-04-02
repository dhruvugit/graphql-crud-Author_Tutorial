package com.apigraphql.singlendpoint.repository;

import com.apigraphql.singlendpoint.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AuthorRepository extends JpaRepository<Author, Long> {

}
