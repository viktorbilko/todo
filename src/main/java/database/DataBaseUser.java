package database;

import lombok.Getter;
import model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Viktor Bilko on 09.12.2017.
 */
public class DataBaseUser {

    @Getter
    private static List<User> listUser = new ArrayList<>();

    public static void setUser(User user){
        listUser.add(user);
    }
}
