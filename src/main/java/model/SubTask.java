package model;

import lombok.Data;

/**
 * @author Viktor Bilko on 25.11.2017.
 */
@Data
public class SubTask {

    private String text;
    private int status; // status: 0 - active, 1 - finished.
}
