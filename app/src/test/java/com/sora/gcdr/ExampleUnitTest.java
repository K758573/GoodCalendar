package com.sora.gcdr;

import org.junit.Test;

import com.sora.gcdr.util.MyUtils;

import java.util.Calendar;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        System.out.println(MyUtils.timeToLongMoreMonth("2022-5-25 1:5",true));
        
        System.out.println(java.util.Calendar.getInstance().get(Calendar.HOUR_OF_DAY)); ;
    }
}