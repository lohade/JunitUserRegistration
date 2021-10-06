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



}
