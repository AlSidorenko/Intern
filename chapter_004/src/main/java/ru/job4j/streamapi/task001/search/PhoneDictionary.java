package ru.job4j.streamapi.task001.search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 21.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PhoneDictionary {

    /**List of Person.*/
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
        return persons.stream().filter(i -> (i.getName().contains(key) || i.getSurname().contains(key)
                || i.getPhone().contains(key) || i.getAddress().contains(key))).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "PhoneDictionary{"
                + "persons=" + persons + '}';
    }
}
