package database;

import lombok.Getter;
import model.SubTask;
import model.UserTask;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Viktor Bilko on 12.11.2017.
 */
public class DataBaseUserTask {

    @Getter
    private static List <UserTask> list = new ArrayList<>();

    public static List setList(UserTask userTask){
        list.add(userTask);
        return list;
    }
}