package com.apigraphql.singlendpoint.resolver;

import com.apigraphql.singlendpoint.model.Author;
import com.apigraphql.singlendpoint.model.Tutorial;
import com.apigraphql.singlendpoint.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import graphql.kickstart.tools.GraphQLResolver;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
    @Autowired
    private AuthorRepository authorRepository;

    public TutorialResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Tutorial tutorial) {
        return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
    }
}