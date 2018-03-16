package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 21.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PhoneDictionary {

    /**
     * List of Person.
     */
    private List<Person> persons = new ArrayList<Person>();

    /**
     * Method adding item.
     * @param person - list of person.
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();

        for (Person person : persons) {
            if(person.toString().contains(key))  {
                result.add(person);
            }
        }
        /*
        for (Person person : persons) {
            if (person != null & person.getName().contains(key)) {
                 result.add(person);
            } else if (person != null & person.getSurname().contains(key)) {
                result.add(person);
            } else if (person != null & person.getPhone().contains(key)) {
                result.add(person);
            } else if (person != null & person.getAddress().contains(key)) {
                result.add(person);
            } else {
                result.add(null);
            }
        }
        */
        return result;
    }

    @Override
    public String toString() {
        return "PhoneDictionary{"
                + "persons=" + persons + '}';
    }
}
