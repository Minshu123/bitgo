package interview;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;
    UserController() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(int user_id) {
        // remove user
    }
}
