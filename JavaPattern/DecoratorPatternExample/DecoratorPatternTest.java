package DecoratorPatternExample;
// File: DecoratorPatternTest.java
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        
        // Adding SMS functionality to Email Notifier
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        
        // Adding Slack functionality to Email and SMS Notifier
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        
        // Sending notification via Email, SMS, and Slack
        slackNotifier.send("Hello World!");

        // Sending notification via Email and SMS
        smsNotifier.send("Hello SMS!");
    }
}
