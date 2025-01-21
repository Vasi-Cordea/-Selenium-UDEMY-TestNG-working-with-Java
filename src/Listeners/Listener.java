package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {

    public void onTestSuccess(ITestResult tr){
        System.out.println("Test case pass");
    }
    public void onTestFailed(ITestResult tr){
        System.out.println("Test case failed");
    }
}
