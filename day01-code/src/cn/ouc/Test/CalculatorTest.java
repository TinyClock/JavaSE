package cn.ouc.Test;

import cn.ouc.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: Chuansheng Zhong
 * @create: 2019-12-03 11:14
 **/
public class CalculatorTest {
    /*
        初始化方法：
        用于资源申请，所有测试方法在执行之前都会执行该方法
     */
    @Before
    public void init(){
        System.out.println("初始化：");
    }

    /*
        释放资源方法：
        在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("结束了");
    }

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        //3.断言 我断言这个结果是3，是为绿色，否为红色
        Assert.assertEquals(3, c.add(1, 2));
    }

    @Test
    public void testSub() {
        Calculator c = new Calculator();
        Assert.assertEquals(-1, c.sub(1, 2));
    }


}
