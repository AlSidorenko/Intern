package ru.job4j.inheritance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class InheritanceTest {
	/**
     * Test  Doctor say Hello.
     */
    @Test
    public void doctorSayHello() {
        Doctor doctor = new Doctor("Ivan", 38, "m", "dentist");
		String result = (doctor.sayHello(doctor.getName(), doctor.getSpecialty()));
		String expected = "Hello! My name is Ivan. My speciality dentist.";
		assertThat(result, is(expected));
    }
    /**
     * Test  Doctor treats the patient.
     */
    @Test
    public void doctorTreatsPatient() {
        Doctor doctor = new Doctor("Ivan", 38, "m", "dentist");
        Patient patient = new Patient("Sergey", 25, "m");
        String result = (doctor.diagnoseHeal(patient));
        String expected = "Doctor Ivan treats the patient Sergey";
        assertThat(result, is(expected));
    }
    /**
     * Test  Doctor Introduce Yourself.
     */
    @Test
    public void doctorIntroduceYouself() {
        Doctor doctor = new Doctor("Ivan", 38, "m", "dentist");
        String result = (doctor.myAge(doctor.getName(), doctor.getAge()));
        String expected = "My name is Ivan. I'm 38 years old.";
        assertThat(result, is(expected));
    }
}