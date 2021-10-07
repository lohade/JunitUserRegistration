import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class MailValidation {

    public boolean expected;
    public String mail;
    public  User user;

    /*
    Initialized the user.file for checking the validation of email
    before is used for run each cases after initializing
     */
    @Before
    public void initialize(){
        user=new User();
    }

    // create parameterized constructor of class
    public MailValidation(boolean expected,String mail){
        this.expected=expected;
        this.mail=mail;
    }

    /*
    Create static iterable variable for return each object of array
    create object array of two dimensionally of first is result nd second is string
     */
    @Parameterized.Parameters
    public static Iterable<Object> data(){
        return Arrays.asList(new Object[][]{
                {true,"abhi@gmail.com"},{true,"abhi.lohade@gmail.com.in"},
                {false,"abhi.@gmail.com"},{false,"abhi@gmail."}

        });
    }

    //checking each test cases for assert equal method.
    @Test
    public void name(){
        Assert.assertEquals(expected,user.email(mail));
    }
}
