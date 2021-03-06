package ru.job4j.streamapi.task001.transfers;

import java.util.ArrayList;
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

    /**A collection that indicates that each user can have a list of bank accounts.*/
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
        if (this.bank.keySet().stream()
                .filter(s -> user.getPassport().equals(user.getPassport()))
                .map(this.bank::get)
                .flatMap(coll -> coll.stream())
                .noneMatch(acc -> account.equals(acc))) {
            this.bank.keySet().stream()
                    .filter(s -> user.getPassport().equals(user.getPassport()))
                    .map(this.bank::get)
                    .forEach(list -> list.add(account));
        }
    }

    /**
     * Get method.
     *
     * @param user    - user.
     * @param account - account.
     * @return - index of account.
     */
    private Account getActualAccount(User user, Account account) {
        Account index = null;
        ArrayList<Account> list = this.bank.get(user);
        if (user.getName() != null && user.getPassport() != null
                && account.getRequisites() != null) {
            index = list.get(list.indexOf(account));
        }
        return index;
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
        List<List<Account>> list = this.bank.keySet().stream().filter(
                key -> key.getPassport().equals(user.getPassport())
        ).map(this.bank::get).collect(Collectors.toList());
        return list.isEmpty() ? new ArrayList<>() : list.get(0);
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
    private Account getAccount(User sourceUser, String srcRequisite) {
        Account rsl = null;
        for (Account account : this.getUserAccounts(sourceUser)) {
            if (srcRequisite.equals(account.getRequisites())) {
                rsl = account;
            }
        }
        return rsl;
    }

    /**
     * Method checks for compliance with the passport.
     *
     * @param srcPassport - passport ID.
     * @return - passport.
     */
    private User getUserByPassport(String srcPassport) {
        List<User> users = this.bank.keySet().stream().filter(
                x -> srcPassport.equals(x.getPassport())
        ).collect(Collectors.toList());
        return users.isEmpty() ? null : users.get(0);
    }

    @Override
    public String toString() {
        return "Bank{" + "accounts=" + bank + "}";
    }
}