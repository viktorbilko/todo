package service.impl;

import dao.factory.DaoFactory;
import model.User;
import model.UserTask;
import service.UserTaskService;

import java.util.List;

/**
 * @author Viktor Bilko on 16.11.2017.
 */
public class UserTaskServiceImpl implements UserTaskService {

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTask getUserTask() {
        return DaoFactory.getUserTaskDao().getUserTask();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setUserTask(UserTask userTask) {
        DaoFactory.getUserTaskDao().setUser(userTask);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UserTask> find(String string) {
        return DaoFactory.getUserTaskDao().find(string);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean update(UserTask userTask) {
        return DaoFactory.getUserTaskDao().update(userTask);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UserTask> getUserTasks(User user) {
        return DaoFactory.getUserTaskDao().getUserTasks();
    }
}
