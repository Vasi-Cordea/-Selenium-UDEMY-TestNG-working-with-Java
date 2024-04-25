package DependsOnMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
    @Test ( )
    public void Login() {

        System.out.println("Login" );
        Assert.assertEquals("String1", "String2");

    }
    @Test (dependsOnMethods = {"Login"})
    public void Navigating() {

        System.out.println("Navigating");
    }
    @Test (dependsOnMethods = {"Login"})
    public void Logout() {

        System.out.println("Log out");
    }



}
