package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void LoginviaEmail(){

        System.out.println("Login via email");
try{
    Assert.assertEquals("Vasi", "Vasi");
}
catch(Throwable t){
    System.out.println(t);
}
    }
    @Test
    public void LoginviaFacebook(){

        System.out.println("Login via Facebook");
    }
    @Test
    public void LoginviaTwitter(){

        System.out.println("Login via Twitter");
    }

}
