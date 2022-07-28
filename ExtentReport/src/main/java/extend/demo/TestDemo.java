package extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestDemo {
    @Test
    public  void  test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public  void  test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public  void  test3(){
        Reporter.log("log");
        throw new RuntimeException("运行异常");
    }

}
