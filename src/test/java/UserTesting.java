import org.junit.Assert;
import org.junit.Test;

public class UserTesting {

    User user=new User();
    @Test
    public void name_returnTrue(){
        boolean result=user.firstName("Abhishek");
        Assert.assertTrue(result);
    }

    @Test
    public void name_whenWrong(){
        boolean result1=user.firstName("abhishek");
        Assert.assertFalse(result1);
    }

    @Test
    public void surname_returnTrue(){
        boolean result_lastname=user.lastName("Lohade");
        Assert.assertTrue(result_lastname);
    }

    @Test
    public void surname_whenWrong_returnFalse(){
        boolean surname_result=user.lastName("lohade");
        Assert.assertFalse(surname_result);
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

    @Test
    public void givenMobile_whenCorrectDigit_returnTrue(){
        boolean mobile_result=user.mobile_number("91 9730212161");
        Assert.assertTrue(mobile_result);
    }

    @Test
    public void givenPassword1_whenCorrect_returnTrue(){
        boolean password1=user.password_rule1("abhishek");
        Assert.assertTrue(password1);
    }
    @Test
    public void givenPassword1_whenWrong_returnFalse(){
        boolean password1=user.password_rule1("abhi");
        Assert.assertFalse(password1);
    }
    @Test
    public void givenPassword2_whenCorrect_returnTrue(){
        boolean password2=user.password_rule2("Abhishek");
        Assert.assertTrue(password2);
    }
    @Test
    public void givenPassword2_whenWrong_returnFalse(){
        boolean password2=user.password_rule2("abhishek");
        Assert.assertFalse(password2);
    }

    @Test
    public void givenPassword3_whenCorrect_returnTrue(){
        boolean password3=user.password_rule3("Abhishek10");
        Assert.assertTrue(password3);
    }
    @Test
    public void givenPassword3_whenWrong_returnFalse(){
        boolean password3=user.password_rule3("Abhishek");
        Assert.assertFalse(password3);
    }


    @Test
    public void givenPassword_whenCorrect_returnTrue(){
        boolean password_validation=user.password_Validation("Abhishek@1");
        Assert.assertTrue(password_validation);
    }

    @Test
    public void givenPassword_whenWrong_returnFalse(){
        boolean password_result=user.password_Validation("abhish@10");
        Assert.assertFalse(password_result);
    }

}
