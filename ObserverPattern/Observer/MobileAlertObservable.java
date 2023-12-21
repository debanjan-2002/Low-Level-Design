package Observer;

import Observable.StockObservable;

public class MobileAlertObservable implements NotificationAlertObserver {
    String userName;
    StockObservable observable;

    // Constructor
    public MobileAlertObservable(String emailId, StockObservable observable) {
        this.userName = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Product is in stock! Hurry up!");
    }

    private void sendMessageOnMobile(String userName, String message) {
        System.out.println("Message sent to : " + userName);
        System.out.println(message);
        // Send the actual message to mobile phone of user
    }
}
