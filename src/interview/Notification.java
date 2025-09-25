package interview;

public class Notification {
    int id;
    Coin coin;
    String body;
    Notification(int id, Coin coin, String body) {
        this.id = id;
        this.coin = coin;
        this.body = body;
    }


    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
