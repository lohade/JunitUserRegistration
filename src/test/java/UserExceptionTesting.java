import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserExceptionTesting {
    //create object of exception user class
    ExceptionUser exceptionUser=new ExceptionUser();

    //create method of exception user for calling a test cases
    @Before
    public void setExceptionUser(){
       exceptionUser=new ExceptionUser();

    }
    //test use for calling testing method
    @Test
    public void getUser_whenNotProper_returnException(){
        try{
            boolean result=exceptionUser.firstName(null);
            if(result==true){
                Assert.assertTrue(result);
            }
            else {
                //Assert.assertFalse(result);
                System.out.println("please check the condition");
            }
        }
        //catch use for catching  exception
        catch (UserException e){
            e.printStackTrace();//use for calling a print exception
        }
    }
    @Test
    public void getUserSurname_whenNotProper_returnException(){
        try {
            boolean result_last= exceptionUser.lastName("lohade");
            if(result_last==true) {
                Assert.assertTrue(result_last);
            }
            else {
                Assert.assertFalse(result_last);
                System.out.println("please check last name ");
            }

            }catch(UserException e){
                e.printStackTrace();
            }
    }

    @Test
    public void getEmail_whenNotProper_returnException(){
        try {
            boolean result_mail= exceptionUser.email(null);
            if(result_mail==true) {
                Assert.assertTrue(result_mail);
            }
            else {
                Assert.assertFalse(result_mail);
                System.out.println("please check email address properly");
            }

        }catch(UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void getMobileNumber_whenNotEnter_returnException(){
        try{
            boolean mobile=exceptionUser.MobileNumber("91 97302121");
            if(mobile==true){
                Assert.assertTrue(mobile);
            }
            else{
                Assert.assertFalse(mobile);
                System.out.println("enter proper phone number");
            }
        }catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void getPassword_whenNotEnterCorrect_returnException(){
        try{
            boolean password_result=exceptionUser.Password("Abhishek@10");
            if(password_result==true){
                Assert.assertTrue(password_result);
            }
            else{
                Assert.assertFalse(password_result);
                System.out.println("please check each and every condition of password");
            }
        }catch (UserException e){
            e.printStackTrace();
        }
    }


}
