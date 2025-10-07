public class Email {
    private String emailId;
    private String emailPassword;

    public Email(String emailId, String emailPassword) {
        this.emailId = emailId;
        this.emailPassword = "Zaid@123"; // Default password
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }

    private boolean hasUpperCase(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) return true;
        }
        return false;
    }

    private boolean hasLowerCase(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isLowerCase(ch)) return true;
        }
        return false;
    }

    private boolean hasDigit(String pass) {
        for (char ch : pass.toCharArray()) {
            if (Character.isDigit(ch)) return true;
        }
        return false;
    }

    private boolean hasSpecialChar(String pass) {
        for (char ch : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) return true;
        }
        return false;
    }

    public boolean validatePassword(String newPassword) {
        return newPassword.length() >= 8 && hasUpperCase(newPassword) && hasLowerCase(newPassword)
                && hasDigit(newPassword) && hasSpecialChar(newPassword);
    }

    public String changePassword(String oldPassword, String newPassword) {
        if (!oldPassword.equals(this.emailPassword)) {
            return "Old password does not match. Cannot set new password.";
        }
        if (validatePassword(newPassword)) {
            this.emailPassword = newPassword;
            return "Password changed successfully to: " + newPassword;
        }
        return "Password must be at least 8 chars long and include uppercase, lowercase, digit, and special character.";
    }
}
