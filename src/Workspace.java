import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Workspace extends Gmail {
    private ArrayList<Meeting> calendar;

    public Workspace(String emailId) {
        super(emailId, Integer.MAX_VALUE);
        this.calendar = new ArrayList<>();
    }

    public void addMeeting(Meeting meeting) {
        calendar.add(meeting);
        System.out.println("Meeting added: " + meeting.getStartTime() + " to " + meeting.getEndTime());
    }

    // Maximum non-overlapping meetings
    public int findMaxMeeting() {
        if (calendar.isEmpty()) return 0;

        // Sort meetings by end time
        Collections.sort(calendar, Comparator.comparing(Meeting::getEndTime));

        int count = 1;
        Date lastEnd = calendar.get(0).getEndTime();

        for (int i = 1; i < calendar.size(); i++) {
            if (!calendar.get(i).getStartTime().before(lastEnd)) {
                count++;
                lastEnd = calendar.get(i).getEndTime();
            }
        }

        return count;
    }
}
