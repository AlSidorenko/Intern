package ru.job4j.inheritance;

/**
 * Super Class Profession.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Profession {
    /**
     *@param name - String.
     */
    private String name;
    /**
     *@param age - int.
     */
    private int age;
    /**
     *@param gender - String.
     */
    private String gender;
    /**
     *@param specialty - String.
     */
    private String specialty;
    /**
     *Constructor Profession - default.
     */
    public Profession() {
    }
    /**
     *Constructor Profession.
     *@param name - String.
     *@param age - int.
     *@param gender - String.
     */
    public Profession(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    /**
     *Constructor Profession.
     *@param name - String.
     *@param age - int.
     *@param gender - String.
     *@param specialty - String.
     */
    public Profession(String name, int age, String gender, String specialty) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.specialty = specialty;
    }
    /**
     *Method Introduce Yourself .
     *@param name - String.
     *@param age - int.
     *@return String.
     */
    public String myAge(String name, int age) {
        return "My name is " + name + ". I'm " + age + " years old.";
    }
    /**
     *Method Introduce Say Hello.
     *@param name - String.
     *@param specialty - String.
     *@return Say Hello - String.
     */
    public String sayHello(String name, String specialty) {
        return "Hello! My name is " + name + ". My speciality " + specialty + ".";
    }
    /**
     *Method getName.
     *@return - String name.
     */
    public String getName() {
        return name;
    }
    /**
     *Method setName.
     *@param name - String name.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *Method getAge.
     *@return - int age.
     */
    public int getAge() {
        return age;
    }
    /**
     *Method setAge.
     *@param age - int age.
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     *Method getGender.
     *@return - String gender.
     */
    public String getGender() {
        return gender;
    }
    /**
     *Method setGender.
     *@param gender - String gender.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     *Method getSpecialty.
     *@return - String specialty.
     */
    public String getSpecialty() {
        return specialty;
    }
    /**
     *Method setSpecialty.
     *@param specialty - String specialty.
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}