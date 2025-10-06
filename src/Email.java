public class Email {
    String email_Id ;
    String email_password ;

    public Email(String email_Id, String email_password) {
        this.email_Id = email_Id;
        this.email_password = "Zaid@123";
    }
    public String getEmail_Id() {
        return email_Id;
    }
    public void setEmail_Id(String email_Id) {
        this.email_Id = email_Id;

    }
    public String getEmail_password() {
        return email_password;

    }
    public void setEmail_password(String email_password) {
        this.email_password = email_password;

    }

    boolean isUpperCaseme(String pass){
        for(Character ch : pass.toCharArray()){
            if(Character.isUpperCase(ch)){
                return true;
            }

        }
        return false;
    }
    boolean isLowerCaseme(String pass){
        for(Character ch : pass.toCharArray()){
            if(Character.isLowerCase(ch)){
                return true;
            }
        }
        return false;
    }
    boolean isDigit(String pass){
        for(Character ch : pass.toCharArray()){
            if(Character.isDigit(ch)){
                return true;
            }
        }
        return false;
    }
    boolean isSpecialChar(String pass){
        for(Character ch : pass.toCharArray()){
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                return true;
            }
        }
        return false;
    }
public  boolean checkValidation(String new_password){

        if(new_password.length()<8){
            return false;
        }
        else if(!isUpperCaseme(new_password)){
            return false;
        }
        else if(!isLowerCaseme(new_password)){
            return false;
        }
         else if(!isDigit(new_password)){
             return false;
        }
         else if(!isSpecialChar(new_password)){
             return false;
        }
         return true;


}


    public String changePassword(String old_passowrd,String new_passoword){

        if(!old_passowrd.equals(getEmail_password())){
           return "your password does not match previos password you cant make new password";

        }
        if(checkValidation(new_passoword)){
                this.email_password = new_passoword;
                return "Password changed successfully new password  " + new_passoword;

            }

        return "Password must contain 1 upper case 1 lowercase 1 special characters only";

        }


    }



