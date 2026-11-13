package service.impl;
import service.NotificationService;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        if (!recipient.contains("@")){
            //System.out.printf("Адрес должен содержать @");
            throw new IllegalArgumentException("Адрес должен содержать @");
        }
        if (!recipient.contains(".")){
            //System.out.printf("Адрес должен содержать .");
            throw new IllegalArgumentException("Адрес должен содержать .");
        }
        System.out.printf("[EMAIL] На адрес <%s> отправлено письмо: %s%n", recipient, message);
    }
}