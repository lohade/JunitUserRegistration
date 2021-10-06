import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class user {

    Pattern pattern;
    Matcher matcher;

    public boolean firstName(String name){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();

    }
    public boolean lastName(String name){
        String surname="^[A-Z]+[a-z]{2,}";
        return (Pattern.matches(surname,name));
    }

    public boolean email(String mail){
        String email_regex="^[a-z0-9]{3,}+(.[a-z0-9]{2,}+)*@[a-z]{2,}+(.[a-z.]{2,3})+(.[a-z][2,3]){0,1}$";
        pattern=Pattern.compile(email_regex);
        matcher= pattern.matcher(mail);
        return matcher.matches();

    }

}
