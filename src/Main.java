//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Email obj = new  Email("mz3284704","Zaid@123");
        System.out.println(obj.changePassword("Zaid@123","Asif$123"));
        System.out.println(obj.changePassword("Asif$123","Asif"));
        System.out.println(obj.changePassword("Asif$123","Zfgfdid@13"));
        System.out.println(obj.changePassword("Zaid@123","ashijd"));
        System.out.println(obj.changePassword("Zaid@123","Asif$123"));


    }
}