package ru.job4j.streamapi.task001.studentfiltering;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 23.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SchoolTest {

    /** List of students. */
    private List<Student> students = Arrays.asList(
            new Student(5),
            new Student(84),
            new Student(25),
            new Student(65),
            new Student(95),
            new Student(60)
    );

    /**
     * Class A.
     * The Range Is From 70 to 100.
     */
    @Test
    public void whenTheRangeIsFrom70to100() {
        List<Student> result;
        Predicate<Student> isA = (student -> student.getScore() >= 70 && student.getScore() <= 100);
        School school = new School();
        result = school.collect(students, isA);
        List expected = Arrays.asList(students.get(1), students.get(4));
        assertThat(result, is(expected));
    }

    /**
     * Class B.
     * The Range Is From 50 to 70.
     */
    @Test
    public void whenTheRangeIsFrom50to70() {
        List<Student> result;
        Predicate<Student> isB = (student -> student.getScore() >= 50 && student.getScore() < 70);
        School school = new School();
        result = school.collect(students, isB);
        List expected = Arrays.asList(students.get(3), students.get(5));
        assertThat(result, is(expected));
    }

    /**
     * Class C.
     *  The Range Is From 0 to 50.
     */
    @Test
    public void whenTheRangeIsFrom0to50() {
        List<Student> result;
        Predicate<Student> isC = (student -> student.getScore() < 50);
        School school = new School();
        result = school.collect(students, isC);
        List expected = Arrays.asList(students.get(0), students.get(2));
        assertThat(result, is(expected));
    }
}
