package br.com.well.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.well.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String person) {
		
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Welington");
		person.setLastName("Simões");
		person.setAddress("Rua Vereador Itamar Rodriges");
		person.setGender("Male");
		return person;
	}
	
	public List<Person> findAll() {
		List<Person> personList = new ArrayList<>();
		for (int i = 1; i <= 8; i++) {
			Person person = mockPerson(i);
			personList.add(person);
		}
		return personList;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setAddress("Some address in Brazil " + i);
		person.setGender("Male");
		
		return person;
	}
	
}
