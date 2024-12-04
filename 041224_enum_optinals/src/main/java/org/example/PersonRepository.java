package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    private Map<Integer, Person> personMap;

    public PersonRepository() {
        this.personMap = new HashMap<>();
    }

    public void addPerson(Person person) {
        personMap.put(person.id(), person);
    }

    public Optional<Person> getPersonById(int id) {
        return Optional.ofNullable(personMap.get(id));
    }

    public Map<Integer, Person> getAllPersons() {
        return personMap;
    }
}
