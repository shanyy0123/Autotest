package testng;


import org.testng.annotations.*;

public class BasicAnnotation {
    @AfterTest
    public void testCase1(){
            System.out.println("TEST1");
    }

    @BeforeSuite            //类之前，包含类
    public void Beforsuit(){
        System.out.println("Beforsuit");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite");
    }
    @Test(enabled = false)//忽略测试
    @Parameters({"name","age"})
    public void testCase2(String name,int age){
        System.out.println("name:"+name+","+"age:"+age);
    }

    @Test(dataProvider = "data")
    public void testCase3(String name,int age){
        System.out.println("name:"+name+","+"age:"+age);
    }
    @DataProvider(name="data")
    public java.lang.Object[][] ProviderDate(){
        Object[][] objects= new Object[][]{
                {"QQQQ",10},
                {"QQQQ",20}
        };
        return objects;
    }

}
