package service.impl;

import dao.factory.DaoFactory;
import model.User;
import service.UserService;

/**
 * @author Viktor Bilko on 15.12.2017.
 */
public class UserServiceImpl implements UserService {

    @Override
    public String setUser(User user) {
        return DaoFactory.getUserDao().setUser(user);
    }

    @Override
    public User getUser(User user) {
        return DaoFactory.getUserDao().getUser(user);
    }

    @Override
    public boolean deleteUser(User user) {
        return DaoFactory.getUserDao().deleteUser(user);
    }

    @Override
    public String changePassword(User user, String pass) {
        return DaoFactory.getUserDao().changePassword(user,pass);
    }
}