import java.util.ArrayList;

public class Workspace  extends Gmail {
    private ArrayList<Meeting> calender;
    public Workspace(String email_id){
        super(email_id,Integer.MAX_VALUE);
        this.calender = new ArrayList<>();
    }
public void addMeeting(Meeting meeting){
        calender.add(meeting);
    System.out.println("Meeting added");

}

}
