import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Gmail extends Mail {
    int inboxCapacity;
    List<Mail> inbox;
    List<Mail>trash;
    public Gmail(String email_id,int inboxCapacity) {
        //super(emailId);
        super(email_id);
        this.inboxCapacity = inboxCapacity;
        inbox = new ArrayList<>();
        trash = new ArrayList<>();
    }


    public void recieveMail(Mail mail){
        if(inbox.size()==inboxCapacity){

            Mail upmail=inbox.remove(0);
            trash.add(upmail);
        }

        inbox.add(mail);

    }
    public void deleteMail(String msg){
//        Iterator<Mail> itr =  inbox.iterator();
//        while(itr.hasNext()){
//            Mail mail = itr.next();
//            if(mail.getMsg().equals(msg)){
//                inbox.remove(mail);
//                trash.add(mail);
//
//            }
//        }
        for(Mail mail:inbox){
            if(mail.getMsg().equals(msg)){
                inbox.remove(mail);
                trash.remove(mail);
            }
        }
        System.out.println("Mail moved to trash");

    }
    public String  findLastetMail(){
        if(inbox.isEmpty()){
            return null;
        }
        return inbox.get(inbox.size()-1).getMsg();

    }
    public String findOldestMail(){
        if(inbox.isEmpty()){
            return null;
        }
        return inbox.get(0).getMsg();
    }
    public List<Mail> findmailBetweenDate(Date str,Date end){
        List<Mail> mails = new ArrayList<>();
        for(Mail mail:inbox){
            if(mail.getDate().after(str)&&mail.getDate().before(end)){
                mails.add(mail);
            }
        }
        return mails;
    }
    public int inboxSize(){
        int count=0;
        if(inbox.isEmpty()){
            return 0;
        }
        for(Mail mail:inbox){
         if(mail!=null){
             count++;
         }
        }
        return count;
    }
    public int trashSize(){
        int count=0;
        if(trash.isEmpty()){
            return 0;
        }
        for(Mail mail:trash){
            if(mail!=null){
                count++;
            }


        }
        return count;
    }

}
