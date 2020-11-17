package de.lukaszchalat.rest.webservices.restfulwebservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.lukaszchalat.rest.webservices.restfulwebservices.model.Todo;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {
	
	public List<Todo> findByUsername(String username);

}
