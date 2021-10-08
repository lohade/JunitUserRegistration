import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@FunctionalInterface
interface validationChecking   {
     boolean validation(String validation_data);
}

public class UserLambda{

    static Pattern pattern;
    static Matcher matcher;

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);


        validationChecking firstName=(Name)->{
            String regex_name = "^[A-Z]+[a-z]{2,}";
            return(Pattern.matches(regex_name,Name));
        };

        validationChecking lastName=(surname)->{
            String surname_regex = "^[A-Z]+[a-z]{2,}";
            return(Pattern.matches(surname_regex,surname));
        };

        validationChecking email_validation=(email)->{
            String email_regex="^[a-z0-9]{3,}+(.[a-z0-9]{2,}+)*@[a-z]{2,}+(.[a-z.]{2,3})+(.[a-z][2,3]){0,1}$";
            pattern=Pattern.compile(email_regex);
            matcher=pattern.matcher(email);
            return matcher.matches();

        };

        validationChecking mobile_number=(mobile)->{
            String regex_no="^[0-9]{2}\\s[0-9]{10}";
            pattern=Pattern.compile(regex_no);
            matcher= pattern.matcher(mobile);
            return matcher.matches();
        };

        validationChecking password_checking=(password)->{
            String regex_no="^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
            return(Pattern.matches(regex_no,password));
        };
        System.out.println("enter first name:");
        String name= scanner.next();
        System.out.println("Name validation result:"+firstName.validation(name));

        System.out.println("enter last name:");
        String surame= scanner.next();
        System.out.println("Lastname validation result:"+lastName.validation(surame));

        System.out.println("enter mail id:");
        String mail= scanner.next();
        System.out.println("Mail validation result:"+email_validation.validation(mail));

        System.out.println("enter mobile number:");
        String mobile= scanner.next();
        System.out.println("Mobile validation result:"+mobile_number.validation(mobile));

        System.out.println("enter password:");
        String password= scanner.next();
        System.out.println("Password validation result:"+password_checking.validation(password));

    }
}
