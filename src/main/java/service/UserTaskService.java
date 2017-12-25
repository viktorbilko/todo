package service;

import model.User;
import model.UserTask;

import java.util.List;

/**
 * @author Viktor Bilko on 16.11.2017.
 */
public interface UserTaskService {

    /**
     * @return {@link User}.
     */
    UserTask getUserTask();

    /**
     * @param userTask is task of user.
     */
    void setUserTask(UserTask userTask);

    /**
     * @param string
     * @return {@link UserTask}.
     */
    List<UserTask> find (String string); //todo добавить однослово без пробелов

    /**
     * @param userTask
     * @return result of update.
     */
    boolean update(UserTask userTask);

    /**
     * @return {@link UserTask}.
     */
    List<UserTask> getUserTasks(User user);
}
