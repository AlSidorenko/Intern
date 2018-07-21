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
    private TreeMap<User, ArrayList<Account>> treeMap = new TreeMap<>();

    /**
     * The method of adding a user to the collection.
     * @param user - user.
     */
    public void addUser(User user) {
        this.treeMap.put(user, new ArrayList<>());
    }

    /**
     * The method deletes the user from the collection.
     * @param user - user.
     */
    public void delete(User user) {
        this.treeMap.remove(user);
    }

    /**
     * The method adds an account to the user in the collection.
     * @param user - user.
     * @param account - account.
     */
    public void add(User user, Account account) {
        this.treeMap.get(user).add(account);
    }

    /**
     * Get method.
     * @param user - user.
     * @param account - account.
     * @return - index of account.
     */
    private Account getActualAccount(User user, Account account) {
        ArrayList<Account> list = this.treeMap.get(user);
        return list.get(list.indexOf(account));
    }

    /**
     * The method deletes the account from the user.
     * @param user - user.
     * @param account - account.
     */
    public void deleteAccount(User user, Account account) {
        this.treeMap.get(user).remove(account);
    }

    /**
     * Get method.
     * @param user - user.
     * @return - collection user.
     */
    public List<Account> getAccounts(User user) {
        return this.treeMap.get(user);
    }

    /**
     * The method checks to determine the possibility of making money transfers.
     * @param user1 - user first.
     * @param account1 - account first.
     * @param user2 - user second.
     * @param account2 - account second.
     * @param amount - amount transfer.
     * @return - boolean.
     */
    public boolean transfer(User user1, Account account1,
                                 User user2, Account account2, double amount) {
        return this.treeMap.get(user1).contains(account1)
                && this.treeMap.get(user2).contains(account2)
                && getActualAccount(user1, account1).transfer(
                getActualAccount(user2, account2), amount);
    }

    @Override
    public String toString() {
        return "Bank{" + "accounts=" + treeMap + "}";
    }
}