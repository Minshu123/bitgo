package interview;

public class NotificationController {
    private int currentId = 1;
    public Notification createNotification(Coin coin) {
        return new Notification(currentId++, coin, "Current price of coin is:- " + coin.currentPrice + " Current tradeVolume is:- " + coin.tradeVolume);
    }
}
