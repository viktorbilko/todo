package dao.factory;

import dao.UserDao;
import dao.UserTaskDao;
import dao.impl.UserDaoImpl;
import dao.impl.UserTaskDaoImpl;

/**
 * @author Viktor Bilko on 16.11.2017.
 */
public class DaoFactory {

    public static UserTaskDao getUserTaskDao(){
        return new UserTaskDaoImpl();
    }

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}