package testng.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteConfig {
    @BeforeSuite            //类之前，包含类
    public void Beforsuit(){
        System.out.println("Beforsuit运行了");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite运行了");
    }
}
