package ru.job4j.streamapi.task001.studentfiltering;

/**
 * Created on 31.01.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Student {


    /** Variable score.*/
    private int score;

    /**
     * Constructor.
     * @param score - variable.
     */
    public Student(int score) {
        this.score = score;
    }

    /**
     * Method get.
     * @return - int variable.
     */
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" + "score="
                + score + '}';
    }
}
