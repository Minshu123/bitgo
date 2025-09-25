package interview;

import java.util.ArrayList;
import java.util.List;

public class CoinController {
    List<Coin> coins;

    CoinController() {
        coins = new ArrayList<>();
    }

    public void addCoin(Coin coin) {
        coins.add(coin);
    }

    public void subscribeUser(User user, Coin coin) {
        coin.subscribeUser(user);
    }

    public void updatePrice(int price, Coin coin) {
        coin.updatePrice(price);
    }
}
