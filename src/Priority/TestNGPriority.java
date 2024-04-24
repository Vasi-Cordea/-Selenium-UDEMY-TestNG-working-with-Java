package Priority;

import org.testng.annotations.Test;

public class TestNGPriority {
    @Test (priority =1)
    public void Login() {

        System.out.println("Login" );


    }
    @Test (priority =2)
    public void Navigating() {

        System.out.println("Navigating");
    }
    @Test (priority =3)
    public void Logout() {

        System.out.println("Log out");
    }



}
