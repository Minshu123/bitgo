package interview;

import java.util.ArrayList;
import java.util.List;

public class Coin {
    int id;
    int currentPrice;
    int tradeVolume;
    List<User> subscribedUsers;
    NotificationController nc;
    List<Notification> notifications;
    Notification currentNotification;

    Coin(int id) {
        this.id = id;
        nc = new NotificationController();
        subscribedUsers = new ArrayList<>();
        notifications = new ArrayList<>();
    }

    public void subscribeUser(User user) {
        subscribedUsers.add(user);
    }

    public void updatePrice(int price) {
        this.currentPrice = price;
        currentNotification = nc.createNotification(this);
        notifications.add(currentNotification);
        for(User user: subscribedUsers) {
            try {
                user.sendNotification(currentNotification);
                user.sent.add(currentNotification);
            }
            catch (Exception e) {
                user.failed.add(currentNotification);
            }
        }
    }

    public void updateTradeVolume(int tradeVolume) {
        this.tradeVolume = tradeVolume;
        currentNotification = nc.createNotification(this);
        notifications.add(currentNotification);
        for(User user: subscribedUsers) {
            try {
                user.sendNotification(currentNotification);
                user.sent.add(currentNotification);
            }
            catch (Exception e) {
                user.failed.add(currentNotification);
            }
        }
    }

    public void deleteNotification(int id) {
        for(Notification notification: notifications) {
            if(notification.getId() == id) {
                notifications.remove(notification);
                break;
            }
        }
    }

    public List<Integer> getNotifications() {
        List<Integer> notificationIds = new ArrayList<>();
        for(Notification notification: notifications) {
            notificationIds.add(notification.id);
        }
        return notificationIds;
    }
}
