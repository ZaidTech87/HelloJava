import java.util.Date;

public class Mail {
    private Date date;
    private String senderId;
    private String msg;

    public Mail(Date date, String senderId, String msg) {
        this.date = date;
        this.senderId = senderId;
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
}
