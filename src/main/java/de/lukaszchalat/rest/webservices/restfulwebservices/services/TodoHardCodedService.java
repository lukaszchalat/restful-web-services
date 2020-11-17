package de.lukaszchalat.rest.webservices.restfulwebservices.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import de.lukaszchalat.rest.webservices.restfulwebservices.model.Todo;

@Service
public class TodoHardCodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static long idCounter;
	
	static {
		todos.add(new Todo(++idCounter, "TestUser", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "TestUser", "Learn about Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "TestUser", "Learn about Angular", new Date(), false));
		todos.add(new Todo(++idCounter, "TestUser", "Learn about Vue.js", new Date(), false));
	}
	
	public List<Todo> findAll() {
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			int index = todos.indexOf(todo);
			todos.set(index, todo);
		}
		
		return todo;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		
		if(todo == null) return null;
		
		if(todos.remove(todo)) {
			return todo;
		}
		
		return null;
	}
	
	public Todo findById(long id) {
		return todos.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
	}

}
