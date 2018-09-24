package week3;
import  org.junit.Test;
import org.junit.*;
public class Week3Test  {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void maxTest(){
        Assert.assertEquals(5,Week3.max(5,2));
        Assert.assertEquals(0,Week3.max(0,-90));
        Assert.assertEquals(1000,Week3.max(1000,999));
        Assert.assertEquals(1,Week3.max(1,0));
        Assert.assertEquals(-190,Week3.max(-304,-190));


    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void minofArrayTest(){
        int[] a1 = {1,4,9,4,7,0,-2},a2 = {-3,-7,-3,-597,24,0,8535,374,-485,24},a3={0,1},a4={61,34,66,33,23,25,14,7},a5={1000,999,998,997,996,1001};
        Assert.assertEquals(-2,Week3.minOfArray(a1));
        Assert.assertEquals(-597,Week3.minOfArray(a2));
        Assert.assertEquals(0,Week3.minOfArray(a3));
        Assert.assertEquals(7,Week3.minOfArray(a4));
        Assert.assertEquals(996,Week3.minOfArray(a5));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void calculateBMITest(){
        Assert.assertEquals("Thiếu cân",Week3.calculateBMI(50,1.7));
        Assert.assertEquals("Bình thường",Week3.calculateBMI(56,1.71));
        Assert.assertEquals("Thừa cân",Week3.calculateBMI(75,1.71));
        Assert.assertEquals("Béo phì",Week3.calculateBMI(100,1.71));
        Assert.assertEquals("Bình thường",Week3.calculateBMI(60,1.71));
    }

}
