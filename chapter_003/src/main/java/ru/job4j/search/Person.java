package ru.job4j.search;

/**
 * Created on 21.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Person {

    /**
     * Variable name.
     */
    private String name;

    /**
     * Variable Surname.
     */
    private String surname;

    /**
     * Variable phone number.
     */
    private String phone;

    /**
     * Variable address.
     */
    private String address;

    /**
     * Constructor is empty.
     */
    public Person() {
    }

    /**
     * Parameterized constructor.
     * @param name - name of Person.
     * @param surname - surname of Person.
     * @param phone - number phone of Person.
     * @param address - address of Person.
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     *
     * @return - string.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return - string.
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @return - string.
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @return - string.
     */
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{"
                + "name= '" + name + '\''
                + ", surname= '" + surname + '\''
                + ", phone= '" + phone + '\''
                + ", address= '" + address + '\'' + '}';
    }
}
