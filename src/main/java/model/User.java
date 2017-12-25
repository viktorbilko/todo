package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Objects;

/**
 * @author Viktor Bilko on 12.11.2017.
 */
@Data
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    private String password;
    private List<UserTask> listUserTask;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name, password);
    }
}