package LearningTestNG;

import org.testng.annotations.*;

public class TestNGAnotation_1 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("initializa Selenium");

    }

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

    @AfterClass
    public void afterClass() {
        System.out.println("destroy Selenium");
    }
}