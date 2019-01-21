package ru.job4j.streamapi.task002.transfers;


import java.util.Objects;

/**
 * Created on 19.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Account {

    /**
     * Amount of money on the account.
     */
    private double values;

    /**
     * Requisites of the bank account.
     */
    private String requisites;

    /**
     * Constructor.
     *
     * @param values     - amount of money.
     * @param requisites - requisites of the bank account.
     */
    public Account(double values, String requisites) {
        this.values = values;
        this.requisites = requisites;
    }

    /**
     * Get method.
     *
     * @return - values.
     */
    public double getValues() {
        return this.values;
    }

    /**
     * Get method.
     *
     * @return - requisites.
     */
    public String getRequisites() {
        return this.requisites;
    }

    /**
     * The method of which allows the possibility of making a money transfer.
     *
     * @param destination - Requisites of the recipient.
     * @param amount      - value.
     * @return - boolean.
     */
    boolean transfer(Account destination, double amount) {
        boolean success = false;
        if (amount > 0 && amount < this.values && destination != null) {
            this.values -= amount;
            destination.values += amount;
            success = true;
        }
        return success;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Double.compare(account.values, values) == 0
                && Objects.equals(requisites, account.requisites);
    }

    @Override
    public int hashCode() {

        return Objects.hash(values, requisites);
    }

    @Override
    public String toString() {
        return "Account{"
                + "values=" + values
                + ", requisites='" + requisites + '\'' + '}';
    }
}