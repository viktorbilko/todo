package model;

import lombok.Data;

/**
 * @author Viktor Bilko on 25.11.2017.
 */
@Data
public class SubTask {

    private UserTask userTask;
    private String textOfTask;
    private StatusTask status; // status: 0 - active, 1 - finished.
}