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


}
