package dao;

import model.User;
import model.UserTask;

import java.util.List;

/**
 * @author Viktor Bilko on 12.11.2017.
 */
public interface UserTaskDao {

    /**
     * @return {@link User}.
     */
    UserTask getUserTask();

    /**
     * @param userTask is task of user.
     */
    void setUser(UserTask userTask);

    /**
     * @param string
     * @return {@link UserTask}.
     */
    List<UserTask> find (String string);

    /**
     * @param userTask
     * @return result of update.
     */
    boolean update(UserTask userTask);

    /**
     * @return {@link UserTask}.
     */
    List<UserTask> getUserTasks();
}
