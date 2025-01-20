package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataParameters {

    @Test(dataProvider = "testData")
    public void RegisterUser(String firstname,
                             String lastname,
                             String email,
                             String password) {

        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(email);
        System.out.println(password);

    }
    @DataProvider
    public Object[][] testData() {
        Object[][] obj = new Object[3][4];

        obj[0][0]="Vasi";
        obj[0][1]="tester";
        obj[0][2]="Vasi@email.com";
        obj[0][3]="123";

        obj[1][0]="John";
        obj[1][1]="dev";
        obj[1][2]="john1@email.com";
        obj[1][3]="1334";

        obj[2][0]="Inna";
        obj[2][1]="PM";
        obj[2][2]="Inna@email.com";
        obj[2][3]="rko";

        return obj;

    }
}