package dao.impl;

import dao.UserDao;
import database.DataBaseUser;
import model.User;

/**
 * @author Viktor Bilko on 09.12.2017.
 */
public class UserDaoImpl implements UserDao {

    @Override
    public String setUser(User user) {
        boolean isUser = false;

        for (User user1 : DataBaseUser.getListUser()) {
            if (user1.getName().equals(user.getName())) {
                isUser = true;
            }
        }

        if (!isUser) {
            DataBaseUser.setUser(user);
            return "Ok";
        } else {
            return "User with this login already exists";
        }
    }

    @Override
    public User getUser(User user) {
        if (DataBaseUser.getListUser().isEmpty())
            return null;

        if (isContains(user)) {
            return DataBaseUser.getListUser().get(DataBaseUser.getListUser().indexOf(user));
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteUser(User user) {
        return DataBaseUser.getListUser().remove(user);
    }

    @Override
    public String changePassword(User user, String pass) {
        getUser(user).setPassword(pass);
        return "Password changed";
    }

    /**
     * @param user
     * @return boolean value if {@link User} present
     */
    private boolean isContains(User user) {
        return DataBaseUser.getListUser().contains(user);
    }
}