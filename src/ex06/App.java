package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SmsNotifier;

public class App {
    public static void main(String[] args) {
//        EmailNotifier en = new EmailNotifier(new BasicNotifier());
//        en.send();

        Notifier smsNotifier = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        smsNotifier.send();
    }
}
