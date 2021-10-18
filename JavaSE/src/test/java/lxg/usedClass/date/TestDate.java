package lxg.usedClass.date;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author lxg
 * @description 时间处理相关类
 * @date 2021/9/4
 */
public class TestDate {


    @Test
    public  void test() throws ParseException {
        Date date = new Date();
        System.out.println(date); //Sat Sep 04 17:42:01 CST 2021
        System.out.println(date.getTime());

        //时间格式化
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将date类按照规范转换为字符串格式
        String str = dateFormat.format(date);
        System.out.println(str);

        //将字符串转换为对应的日期类
        Date date1 = dateFormat.parse("2021-09-04 20:20:20");
        System.out.println(date1);


        //获取当前系统的时间
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //设置指定时间的日历
        calendar.setTime(date1);
        System.out.println(calendar);


    }
}
