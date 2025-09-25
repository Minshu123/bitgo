package interview;

public class Application {
    UserController uc;
    CoinController cc;

    Application() {
        uc = new UserController();
        cc = new CoinController();
    }

    public static void main(String [] args) {

        Application app = new Application();
        User user1 = new User(12, "raghav", "r@gmail.com");
        User user2 = new User(13, "aman", "a@gmail.com");
        User user3 = new User(14, "anuj", "an@gmail.com");

        app.uc.addUser(user1);
        app.uc.addUser(user2);



        // Creating coin
        Coin coin1 = new Coin(123);
        Coin coin2 = new Coin(124);

        //Subscribing users
        coin1.subscribeUser(user1);
        coin1.subscribeUser(user2);

        coin2.subscribeUser(user2);
        coin2.subscribeUser(user3);

        //updating price of coin1
        coin1.updatePrice(123);
        coin1.updateTradeVolume(234);


        System.out.println("...................");
        //updating price of coin2
        coin2.updatePrice(100);
        coin2.updateTradeVolume(200);


        System.out.println("All notification of Coin1" +  coin1.getNotifications());

        coin1.deleteNotification(1);

        System.out.println("All notification of Coin1" +  coin1.getNotifications());

    }
}
