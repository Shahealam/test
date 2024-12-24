package testng_test;
import org.testng.annotations.Test;

public class DemoTest {

    @Test(priority = 1)
    public void loginTest() {
        System.out.println("Login Test Executed");
    }

    @Test(priority = 2)
    public void searchTest() {
        System.out.println("Search Test Executed");
    }

    @Test(priority = 3)
    public void logoutTest() {
        System.out.println("df");
    }}