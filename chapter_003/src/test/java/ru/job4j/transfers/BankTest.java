package ru.job4j.transfers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 27.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BankTest {

    /**
     * Test.
     * Verify the operation of the method.
     */
    @Test
    public void whenTransferMoneyTrue() {
        Bank bank = new Bank();
        User jack = new User("Jack", "ST 777");
        bank.addUser(jack);
        User john = new User("John", "HD 341");
        bank.addUser(john);
        User smith = new User("Smith", "EC 104");
        bank.addUser(smith);

        bank.add(jack, new Account(500.45, "262777"));
        bank.add(john, new Account(0.0, "252341"));
        bank.add(smith, new Account(49.55, "262104"));

        boolean result = bank.transferMoney("ST 777", "262777", "HD 341",
                "252341", 100.45);
        assertThat(result, is(true));
    }

    /**
     * Test.
     * Verify the operation of the method.
     */
    @Test
    public void whenTransferMoneyFalse() {
        Bank bank = new Bank();
        User jack = new User("Jack", "ST 777");
        bank.addUser(jack);
        User john = new User("John", "HD 341");
        bank.addUser(john);
        User smith = new User("Smith", "EC 104");
        bank.addUser(smith);

        bank.add(jack, new Account(50.45, "262777"));
        bank.add(john, new Account(0.0, "252341"));
        bank.add(smith, new Account(49.55, "262104"));

        boolean result = bank.transferMoney("ST 777", "262777", "HD 341",
                "252341", 100.45);
        assertThat(result, is(false));

    }
}
