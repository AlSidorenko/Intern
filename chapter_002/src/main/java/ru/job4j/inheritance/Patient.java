package ru.job4j.inheritance;

/**
 * Class Patient.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Patient extends Profession {
    /**
     *@param diagnose - String.
     */
    private String diagnose;
    /**
     *Constructor Patient.
     *@param name - String.
     *@param age - int.
     *@param gender - String.
     */
    public Patient(String name, int age, String gender) {
        super(name, age, gender);
    }
    /**
     *Constructor Profession.
     *@param name - String.
     *@param age - int.
     *@param gender - String.
     *@param specialty - String.
     *@param diagnose - String.
     */
    public Patient(String name, int age, String gender, String specialty, String diagnose) {
        super(name, age, gender, specialty);
        this.diagnose = diagnose;
    }
}