package ru.job4j.streamapi.task002.transfers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Created on 19.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Bank {

    /**
     * A collection that indicates that each user can have a list of bank accounts.
     */
    private TreeMap<User, ArrayList<Account>> bank = new TreeMap<>();

    /**
     * The method of adding a user to the collection.
     *
     * @param user - user.
     */
    public void addUser(User user) {
        if (user != null) {
            this.bank.putIfAbsent(user, new ArrayList<>());
        }
    }

    /**
     * The method deletes the user from the collection.
     *
     * @param user - user.
     */
    public void deleteUser(User user) {
        if (user != null) {
            this.bank.remove(user);
        }
    }

    /**
     * The method adds an account to the user in the collection.
     *
     * @param user    - user.
     * @param account - account.
     */
    public void addUserAccount(User user, Account account) {
        this.bank.keySet().stream().filter(
                client -> client.getPassport().equals(user.getPassport())).forEach(client ->
                this.bank.get(user).add(account));
    }

    /**
     * Get method.
     *
     * @param user    - user.
     * @param account - account.
     * @return - index of account.
     */
    public Account getActualAccount(User user, Account account) {
        return bank.values().stream().flatMap(Collection::stream)
                .filter(acc -> acc.getRequisites().equals(acc.getRequisites()))
                .collect(Collectors.toCollection(ArrayList::new)).iterator().next();
    }

    /**
     * The method deletes the account from the user.
     *
     * @param user    - user.
     * @param account - account.
     */
    public void deleteAccount(User user, Account account) {
        this.bank.get(user).remove(account);
    }

    /**
     * Get method.
     *
     * @param user - user.
     * @return - collection user.
     */
    public List<Account> getUserAccounts(User user) {
        return  this.bank.keySet().stream().filter(client -> client.getPassport().equals(user.getPassport()))
                .flatMap(client -> bank.get(user).stream()).collect(Collectors.toList());
    }

    /**
     * The method checks to determine the possibility of making money transfers.
     *
     * @param srcPassport  - first passport.
     * @param srcRequisite - first requisite.
     * @param destPassport - destination passport.
     * @param dstRequisite - destination requisite.
     * @param amount       - amount.
     * @return - boolean result.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dstRequisite, double amount) {
        User sourceUser = getUserByPassport(srcPassport);
        User destinationUser = getUserByPassport(destPassport);
        Account sourceAccount = getAccount(sourceUser, srcRequisite);
        Account destinationAccount = getAccount(destinationUser, dstRequisite);

        boolean rsl = false;
        if (sourceUser != null && destinationUser != null
                && sourceAccount != null && destinationAccount != null) {
            rsl = sourceAccount.transfer(destinationAccount, amount);
        }
        return rsl;
    }

    /**
     * Method checks the user's account.
     *
     * @param sourceUser   - user.
     * @param srcRequisite - requisite.
     * @return - account.
     */
    public Account getAccount(User sourceUser, String srcRequisite) {
        return bank.values().stream().flatMap(Collection::stream)
                .filter(account -> account.getRequisites().equals(srcRequisite))
                .collect(Collectors.toCollection(ArrayList::new)).iterator().next();
    }

    /**
     * Method checks for compliance with the passport.
     *
     * @param srcPassport - passport ID.
     * @return - passport.
     */
    public User getUserByPassport(String srcPassport) {

        return this.bank.keySet().stream().filter(
                user -> user.getPassport().equals(srcPassport))
                .collect(Collectors.toCollection(ArrayList::new)).iterator().next();
    }

    @Override
    public String toString() {
        return "Bank{" + "accounts=" + bank + "}";
    }
}