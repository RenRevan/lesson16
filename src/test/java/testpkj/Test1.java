package testpkj;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Test1 extends BaseTest {

    @Test(dataProvider = "data-for-tests")
    public void tst1(String data){
        System.out.println("test 1 and "+ data);
    }
    @Test
    public void tst2(){
        System.out.println("test 2");
    }
    @Test
    public void tst3(){
        System.out.println("test 3");
    }
    @Test
    public void tst4(){
        System.out.println("test 4");
    }
}
