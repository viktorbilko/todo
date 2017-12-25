package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Viktor Bilko on 12.11.2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTask {

    private int id;
    private String theme;
    private List<SubTask> subTasks;
    private int status; // status: 0 - active, 1 - finished.
}
