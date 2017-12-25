package model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Viktor Bilko on 03.12.2017.
 */

public class SampleTask extends UserTask {

    public SampleTask(int id, String theme, List<SubTask> subTasks, LocalDate date, int status) {
        super(id, theme, subTasks, date, status);
    }
}