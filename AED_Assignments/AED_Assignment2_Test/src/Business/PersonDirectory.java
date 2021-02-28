/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Urvi
 */
public class PersonDirectory {
    
    private List<Person> personDirectory;
    
    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }

    public List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(List<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addNewPerson(Person person) {
        personDirectory.add(person);
        return person;
    }  
}
