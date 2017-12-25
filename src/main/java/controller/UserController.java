package controller;

import dao.factory.DaoFactory;
import lombok.val;
import model.User;
import model.UserTask;
import service.factory.ServiceFactory;
import service.impl.UserServiceImpl;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Viktor Bilko on 15.12.2017.
 */
public class UserController {

    public static void main(String[] args) {

        val userService = new UserServiceImpl();

        val user = new User(1,
                "Tom",
                "123as",
                null);

        userService.setUser(user);

        List<UserTask> userTasks = ServiceFactory.getUserTaskService().getUserTasks(user);

        System.out.println(userService.getUser(user));


        val userTask = new UserTask(1,
                "theme",
                null,
                0);
        ServiceFactory.getUserTaskService().setUserTask(userTask);

        System.out.println(userTasks.size());
    }
}