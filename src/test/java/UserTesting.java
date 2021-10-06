import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;

import java.util.Scanner;


public class UserTesting {

    Scanner scanner=new Scanner(System.in);
    user user=new user();
    @Test
    public void name_returnTrue(){
        boolean result=user.firstName("Abhishek");
        Assert.assertTrue(result);
    }

    @Test
    public void surname_returnTrue(){
        boolean result_lastname=user.lastName("Lohade");
        Assert.assertTrue(result_lastname);
    }

    @Test
    public void givenEmail_whenWrong_returnFalse(){
        boolean email_result=user.email("abhi..@gmail.com");
        Assert.assertFalse(email_result);
    }

    @Test
    public void givenEmail_whenCorrect_returnTrue(){
        boolean email_result=user.email("abhi.lohade@gmail.com.in");
        Assert.assertTrue(email_result);
    }



}
