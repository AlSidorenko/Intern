package ru.job4j.transfers;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

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
        this.bank.put(user, new ArrayList<>());
    }

    /**
     * The method deletes the user from the collection.
     *
     * @param user - user.
     */
    public void delete(User user) {
        this.bank.remove(user);
    }

    /**
     * The method adds an account to the user in the collection.
     *
     * @param user    - user.
     * @param account - account.
     */
    public void add(User user, Account account) {
        this.bank.get(user).add(account);
    }

    /**
     * Get method.
     *
     * @param user    - user.
     * @param account - account.
     * @return - index of account.
     */
    private Account getActualAccount(User user, Account account) {
        ArrayList<Account> list = this.bank.get(user);
        return list.get(list.indexOf(account));
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
        return this.bank.get(user);
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
        if (sourceUser == null || destinationUser == null) {
            return false;
        }
        Account sourceAccount = getAccountByUserAndRequisites(sourceUser, srcRequisite);
        Account destinationAccount = getAccountByUserAndRequisites(destinationUser, dstRequisite);
        if (sourceAccount == null || destinationAccount == null) {
            return false;
        }
        return sourceAccount.transfer(destinationAccount, amount);
    }

    /**
     * Method checks the user's account.
     *
     * @param sourceUser   - user.
     * @param srcRequisite - requisite.
     * @return - account.
     */
    private Account getAccountByUserAndRequisites(User sourceUser, String srcRequisite) {
        for (Account account : this.getUserAccounts(sourceUser)) {
            if (srcRequisite.equals(account.getRequisites())) {
                return account;
            }
        }
        return null;
    }

    /**
     * Method checks for compliance with the passport.
     *
     * @param srcPassport - passport ID.
     * @return - passport.
     */
    private User getUserByPassport(String srcPassport) {
        for (User user : bank.keySet()) {
            if (srcPassport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" + "accounts=" + bank + "}";
    }
}