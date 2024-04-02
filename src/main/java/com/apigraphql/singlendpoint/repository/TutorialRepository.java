package com.apigraphql.singlendpoint.repository;
import com.apigraphql.singlendpoint.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}