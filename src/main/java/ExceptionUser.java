import java.util.regex.Matcher;
import java.util.regex.Pattern;

// create a class
public class ExceptionUser {
    Pattern pattern;
    Matcher matcher;

    // declare a first name method and if exception  throw other class
    public boolean firstName(String name) throws UserException {
        if (name == null) {
            throw new UserException("first name field cannot be empty");
        }
        /* throw  object User exception class for printing an exception message */
        String regex_name = "^[A-Z]+[a-z]{2,}";
        pattern = Pattern.compile(regex_name);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean lastName(String surname) throws UserException {
        if (surname == null) {
            throw new UserException("Should enter some character");
        }
        String surname_regex = "^[A-Z]+[a-z]{2,}";
        return(Pattern.matches(surname_regex, surname));
    }

    public boolean email(String mail) throws UserException {
        if (mail == null) {
            throw new UserException("Mail id is not null");
        }
        String mail_regex = "^[a-z0-9]{3,}+(.[a-z0-9]{2,}+)*@[a-z]{2,}+(.[a-z.]{2,3})+(.[a-z][2,3]){0,1}$";
        return(Pattern.matches(mail_regex,mail));
    }

    public boolean MobileNumber(String mobile) throws UserException{
        if(mobile==null){
            throw new UserException("mobile number is not null");
        }
        String regex_no="^[0-9]{2}\\s[0-9]{10}";
        pattern=Pattern.compile(regex_no);
        matcher= pattern.matcher(mobile);
        return matcher.matches();
    }

    public boolean Password(String password) throws UserException{
        if(password==null){
            throw new UserException("password will be not null");
        }
        String regex_no="^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
        return(Pattern.matches(regex_no,password));
    }


}
