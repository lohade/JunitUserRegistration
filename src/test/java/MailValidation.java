import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
@RunWith(Parameterized.class)
public class MailValidation{
    private UserTesting userTesting;

    @Before
    public void initialize(){
         userTesting=new UserTesting();
    }

    @Parameterized.Parameters
    public static Iterable<Object> data() {
        return Arrays.asList(new Object[][]{
                {true, "john@myComp.com"}, {true, "john123@comp.com"},
                {false, "john1..@comp.com"}, {false, "john1@comp@com"}
        });
    }
    private boolean expected;
    private String name;
    public MailValidation( boolean expected, String name) {
        this.expected = expected;
        this.name = name;
    }
    @Test
    public void name(){
        Assert.assertEquals(expected,MailValidation.data());
    }
}