import org.testng.Assert;
import org.testng.annotations.Test;

public class Chacker {

    @Test
    public void test01(){
        System.out.println("in test01()");
        Assert.assertTrue(true);
    }

    @Test
    public void test02(){
        System.out.println("in test02()");
        Assert.assertTrue(false);
    }

}