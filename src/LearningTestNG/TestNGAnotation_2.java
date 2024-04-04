package LearningTestNG;

import org.testng.annotations.*;

public class TestNGAnotation_2 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Starting TestNG");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("Stopping TestNG");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Start Test Execution");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("initializa Selenium for Class 2");

    }

    @Test
    public void test3() {
        System.out.println("Inside test 3");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("destroy Selenium for clas 2");

}

@AfterTest
public void afterTest() {

    System.out.println("Stop Test Execution");
}
}
