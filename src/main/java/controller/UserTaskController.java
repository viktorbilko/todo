package controller;

import lombok.val;
import service.factory.ServiceFactory;

/**
 * @author Viktor Bilko on 16.11.2017.
 */
public class UserTaskController {

    public static void main(String[] args) {
        val userTaskService = ServiceFactory.getUserTaskService();
    }


}