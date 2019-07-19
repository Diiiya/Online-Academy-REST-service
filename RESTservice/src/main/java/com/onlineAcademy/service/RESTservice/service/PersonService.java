package com.onlineAcademy.service.RESTservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.onlineAcademy.service.RESTservice.database.DatabaseClass;
import com.onlineAcademy.service.RESTservice.model.Person;

public class PersonService {
	
	private Map<String, Person> people = DatabaseClass.getPeople();
	
	public PersonService() {
		people.put("sammy", new Person(1, "Sam", "sammy"));
		people.put("momo", new Person(2, "Molly", "momo"));
	}
	
	public List<Person> getPeople() {
		return new ArrayList<Person>(people.values());
	}
	
	public Person getPerson(String name) {
		return people.get(name);
	}
	
	public Person addPerson(Person person) {
		person.setId(people.size() + 1);
		people.put(person.getName(), person);
		return person;
	}
	
	public Person updatePerson(String name, Person person) {
		if (person.getName().isEmpty()) {
			return null;
		}
		people.put(person.getName(), person);
		return person;
	}
	
	public Person deletePerson(String name) {
	    return people.remove(name);
	}

}
