package vttp.revision.d13revision.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import vttp.revision.d13revision.models.Person;

@Service
public class PersonService {
    private List<Person> persons = new ArrayList<Person>();

    //person created during initialization
    public PersonService(){
        persons.add(new Person("Mark", "Zuckerberg"));
        persons.add(new Person("Elon", "Musk"));
    }

    public List<Person> getPersons(){
        return this.persons;
    }

    //addperson method by passing in person p
    public void addPerson(Person p){
        persons.add(new Person(p.getFirstName(), p.getLastName()));
    }
}
