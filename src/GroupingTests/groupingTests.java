package GroupingTests;

import org.testng.annotations.Test;
/*setup java xml file with groups, include ,exclude*/
public class groupingTests {

    @Test(groups = {"performance"})
    public void feature1() {

        System.out.println("inside feature 1");
    }
    @Test(groups = {"regression"})
    public void feature2() {

        System.out.println("inside feature 2");
    }
    @Test(groups = {"performance"})
    public void feature3() {

        System.out.println("inside feature 3");
    }
    @Test(groups = {"perfomance", "regression"})
    public void feature4() {

        System.out.println("inside feature 4");
    }
}
