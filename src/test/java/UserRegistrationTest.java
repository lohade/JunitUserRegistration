import org.junit.Test;
import org.junit.Assert;


public class UserRegistrationTest {
    User user=new User();

    @Test
   public void givenName_returnTrue(){
        boolean result=user.firstName("Abhi");
        Assert.assertTrue(result);
    }
}

