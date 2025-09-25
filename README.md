Requirements:- 

1.Create a server which will be able to take in the following rest API
2.Create a notification. Line items may include current price of BTC, market trade volume, intra day high price, market cap 
3.Send a notification to an email
4.List sent notifications (sent, outstanding, failed etc.)
5.Delete a notification


<img width="1710" height="1037" alt="Screenshot 2025-09-25 at 6 30 39 PM" src="https://github.com/user-attachments/assets/e7992f47-e8be-446a-a6a0-7c9dd0558053" />

Object
1. User
2. Coin
3. Notification


Explaination:-
1. I have created User class and userController class to handle the user-related operation.
2. We have Coin class which store the coin related information and also has function to subscribe the user we want to send the notification to.
3. Utilizing observer design patter to notify the user whenever coin price or total volume is changed.
4. Coincontroller class is actually responsible for handle operation like adding coin subscribing user and other stuff. This would be singleton class.
5. For ever update in the coin detail, i have created new notification and storing in the coin notifications list and sent the notification to the subscribed users.
6. Also storing the notification to the user list for different scenerio incase if it is sent , failed or outstanding.. etc
7. Also exposed function to soft delete the notification from the coin.


Have Application class as main function where
<img width="1710" height="1107" alt="Screenshot 2025-09-25 at 6 38 42 PM" src="https://github.com/user-attachments/assets/610a91c9-4eb3-4f2a-a8c9-6ee6e52b4aa5" />
 we can add the user to the coin for getting the notification and different other operations. so Application class is the entry points.





