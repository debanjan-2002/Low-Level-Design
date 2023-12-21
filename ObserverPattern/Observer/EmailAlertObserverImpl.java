package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    // Constructor
    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock! Hurry up!");
    }
    private void sendMail(String emailId, String message) {
        System.out.println("Mail sent to : " + emailId);
        System.out.println(message);
        // send the actual email to the end user
    }
}
