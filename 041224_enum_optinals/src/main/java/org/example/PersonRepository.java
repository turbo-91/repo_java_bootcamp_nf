package org.example;
import java.time.DayOfWeek;
import java.util.*;

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

    public int amountPeopleByGender(Gender gender) {
        int count = 0;
        for (Person person : personMap.values()) {
            if (person.gender() == gender) {
                count++;
            }
        }
        return count;
    }

    public Optional<Person> getPersonByName(String name) { // loop necessary, because id is key in map, name isn't
        for (Person person : personMap.values()) {
            if (person.name().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> getAllPersonsByFavoriteWeekday(DaysOfWeek favoriteWeekday) {
        List<Person> personsByFaveDay = new ArrayList<>();
        for (Person person : personMap.values()) {
            if (person.favoriteDay().equals(favoriteWeekday)) {
                personsByFaveDay.add(person);
            }
        }
        return personsByFaveDay;
    }

}
