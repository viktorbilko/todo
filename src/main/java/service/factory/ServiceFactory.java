package service.factory;

import service.UserService;
import service.UserTaskService;
import service.impl.UserServiceImpl;
import service.impl.UserTaskServiceImpl;

/**
 * @author Viktor Bilko on 16.11.2017.
 */
public class ServiceFactory {

    public static UserTaskService getUserTaskService(){
        return new UserTaskServiceImpl();
    }

    public static UserService getUserService(){
        return new UserServiceImpl();
    }
}