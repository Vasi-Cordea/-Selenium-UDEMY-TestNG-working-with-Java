package dataProvider;

import org.testng.annotations.DataProvider;

public class TestDataFile {

    @DataProvider(name = "data")
    public static Object[][] testData() {
        Object[][] obj = new Object[3][4];

        obj[0][0] = "Vasi";
        obj[0][1] = "tester";
        obj[0][2] = "Vasi@email.com";
        obj[0][3] = "123";

        obj[1][0] = "John";
        obj[1][1] = "dev";
        obj[1][2] = "john1@email.com";
        obj[1][3] = "1334";

        obj[2][0] = "Inna";
        obj[2][1] = "PM";
        obj[2][2] = "Inna@email.com";
        obj[2][3] = "rko";

        return obj;


    }

    @DataProvider(name = "logindata")
    public static Object[][] logintestData() {
        Object[][] obj = new Object[3][2];

        obj[0][0] = "Vasi@email.com";
        obj[0][1] = "123";


        obj[1][0] = "john1@email.com";
        obj[1][1] = "1334";

        obj[2][0] = "Inna@email.com";
        obj[2][1] = "rko";

        return obj;
    }
}