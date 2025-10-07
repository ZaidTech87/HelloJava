import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create Workspace and Gmail account
        Workspace workspace = new Workspace("user@gmail.com");

        // Create and receive mails
        workspace.receiveMail(new Mail(new Date(), "sender1@gmail.com", "Hello!"));
        workspace.receiveMail(new Mail(new Date(), "sender2@gmail.com", "Meeting Reminder"));

        System.out.println("Inbox size: " + workspace.inboxSize());
        System.out.println("Latest mail: " + workspace.findLatestMail());

        // Delete a mail
        workspace.deleteMail("Hello!");
        System.out.println("Inbox size after delete: " + workspace.inboxSize());
        System.out.println("Trash size: " + workspace.trashSize());

        // Add meetings
        workspace.addMeeting(new Meeting(new Date(System.currentTimeMillis() + 1000 * 60 * 60),
                new Date(System.currentTimeMillis() + 1000 * 60 * 120)));
        workspace.addMeeting(new Meeting(new Date(System.currentTimeMillis() + 1000 * 60 * 30),
                new Date(System.currentTimeMillis() + 1000 * 60 * 90)));

        System.out.println("Max meetings you can attend: " + workspace.findMaxMeeting());
    }
}
