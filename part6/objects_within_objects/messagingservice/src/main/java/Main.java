import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();
        Message message1 = new Message("Gregor", "How's it going?");
        Message message2 = new Message("Dare", "Good, you?");

        messagingService.add(message1);
        messagingService.add(message2);

        ArrayList<Message> messages = messagingService.getMessages();
        for(Message msg : messages) {
            System.out.println(msg);
        }
    }
}