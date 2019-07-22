package com.onlineAcademy.service.RESTservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.onlineAcademy.service.RESTservice.model.Person;
import com.onlineAcademy.service.RESTservice.service.PersonService;

@Path("/people")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

	PersonService personService = new PersonService();
	
	@GET
	public List<Person> getPeople() {
		return personService.getPeople();
	}
	
	@GET
	@Path("/{personName}")
	public Person getPerson(@PathParam("/{personName}") String name) {
		return personService.getPerson(name);
	}
	
	@POST
	public Person addPerson(Person person) {
		return personService.addPerson(person);
	}
	
	@PUT
	@Path("/{personName}")
	public Person updatePerson(@PathParam("/{personName}") String name, Person person) {
		person.setName(name);
		return personService.updatePerson(person.getName(), person);
	}
	
	@DELETE
	@Path("/{personName}")
	public void deletePerson(@PathParam("/{personName}") String name) {
		personService.deletePerson(name);
	}
	
}
