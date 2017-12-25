package dao;

import model.User;

/**
 * @author Viktor Bilko on 09.12.2017.
 */
public interface UserDao {

    String setUser(User user);

    User getUser(User user);

    boolean deleteUser (User user);

    String changePassword (User user,String pass);
}
