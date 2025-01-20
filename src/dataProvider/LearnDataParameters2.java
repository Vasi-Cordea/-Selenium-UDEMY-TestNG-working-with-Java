package dataProvider;

import org.testng.annotations.Test;

public class LearnDataParameters2 {

    @Test(dataProviderClass = TestDataFile.class, dataProvider = "data")
    public void RegisterUser(String firstname,
                             String lastname,
                             String email,
                             String password) {

        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(email);
        System.out.println(password);

    }

    @Test(dataProviderClass = TestDataFile.class, dataProvider = "logindata")
    public void LoginUser(
            String email,
            String password) {

        System.out.println(email);
        System.out.println(password);

    }
}