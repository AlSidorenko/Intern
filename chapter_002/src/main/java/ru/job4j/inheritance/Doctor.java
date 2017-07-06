package ru.job4j.inheritance;

/**
 * Class Doctor.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Doctor extends Profession {
    /**
     *Constructor Doctor.
     *@param name - String.
     *@param age - int.
     *@param gender - String.
     *@param specialty - String.
     */
    public Doctor(String name, int age, String gender, String specialty) {
        super(name, age, gender, specialty);
    }
    /**
     *Diagnose Heal.
     *@param patient - link.
     *@return - String Diagnose.
     */
    public String diagnoseHeal(Patient patient) {
        return "Doctor " + getName() + " treats the patient " + patient.getName();
    }
}
