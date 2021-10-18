package lxg.junit;

import com.lxg.junit.Calculate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lxg
 * @description 测试类
 * @date 2021/9/23
 */
public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("测试方法开始了");
    }

    @After
    public void end(){
        System.out.println("方法测试结束了");
    }

    //测试加法
    @Test
    public void testAdd(){
        Calculate cal = new Calculate();
        int result = cal.add(10,20);
        //System.out.println(result); 程序的运行结果可以不关注
        //加入断言：预测以下为结果，判断一下预测的结果和实际的结果是否一致：
        Assert.assertEquals(30,result);//第一个参数预测结果，第二个参数实际结果
        Assert.assertEquals(25,result);
    }

    //测试减法
    @Test
    public void testSub(){
        Calculate cal = new Calculate();
        int result = cal.sub(30,20);
        System.out.println(result);
    }
}
