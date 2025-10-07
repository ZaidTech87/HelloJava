import java.util.Date;

public class Mail {
    private Date date;
    private String sender_id;
    private String msg;

   public Mail(Date date,String sender_id,String msg){
       this.date = date;
       this.sender_id = sender_id;
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
    public String getSender_id() {
       return sender_id;
    }
    public void setSender_id(String sender_id) {
       this.sender_id = sender_id;
    }

}
