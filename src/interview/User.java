package interview;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String name;
    String email;
    List<Notification> sent;
    List<Notification> failed;
    List<Notification> outstanding;

    User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        sent = new ArrayList<>();
        failed = new ArrayList<>();
        outstanding = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void sendNotification(Notification notification) {
        System.out.println("user :- "+ name + " has got the notification. " + notification.getBody());
    }
}
