package LearningTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TenstNGAnotation_1 {
    @BeforeMethod
    public void beforeMethod() {

        System.out.println("Opening Browser");
    }


    @Test
    public void test1() {

        System.out.println("inside test 1");
    }

    @Test
    public void test2() {
        System.out.println("inside test 2");


    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Closing Browser");
    }
}