import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Gmail extends Mail {
    private int inboxCapacity;
    private List<Mail> inbox;
    private List<Mail> trash;

    public Gmail(String emailId, int inboxCapacity) {
        super(new Date(), emailId, "Welcome Mail!");
        this.inboxCapacity = inboxCapacity;
        this.inbox = new ArrayList<>();
        this.trash = new ArrayList<>();
    }

    public void receiveMail(Mail mail) {
        if (inbox.size() >= inboxCapacity) {
            Mail removedMail = inbox.remove(0);
            trash.add(removedMail);
        }
        inbox.add(mail);
    }

    public void deleteMail(String msg) {
        Iterator<Mail> itr = inbox.iterator();
        while (itr.hasNext()) {
            Mail mail = itr.next();
            if (mail.getMsg().equals(msg)) {
                itr.remove();
                trash.add(mail);
                System.out.println("Mail moved to trash: " + msg);
                return;
            }
        }
        System.out.println("Mail not found: " + msg);
    }

    public String findLatestMail() {
        if (inbox.isEmpty()) return null;
        return inbox.get(inbox.size() - 1).getMsg();
    }

    public String findOldestMail() {
        if (inbox.isEmpty()) return null;
        return inbox.get(0).getMsg();
    }

    public List<Mail> findMailBetweenDates(Date start, Date end) {
        List<Mail> mails = new ArrayList<>();
        for (Mail mail : inbox) {
            if (mail.getDate().after(start) && mail.getDate().before(end)) {
                mails.add(mail);
            }
        }
        return mails;
    }

    public int inboxSize() {
        return inbox.size();
    }

    public int trashSize() {
        return trash.size();
    }
}
