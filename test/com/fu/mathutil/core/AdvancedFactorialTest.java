/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.core;

import static com.fu.mathutil.core.MathUtil.getFactorial;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author thien
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {

    //ta viet ki thuat moi, tach data ra han cac lenh kiem tra ham
    //data nay ta co the dat o file .txt/.csv/.excel, database ben ngoai
    //input va output /expected la tung cap
    //nhieu cap can phai test, vay nen data de test se la mang 2 chieu
    //mang 2 chieu se dc nap tu .txt/ dabatase,..
    //hoac nap lun 1 mang 2 chieu ngay day
    @Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {3, 6},
            {4, 24},
            {5, 1120}
        };
    }
    @Parameter(value = 0) //map voi cot 0 cua tap data
    public int input;
    @Parameter(value = 1) //map voi cot 1 cua tap data
    public long expected;

    //map 2 cot vao 2 bien de fill trung vao ham check
    //ham checkFactorial, ta goi la testing kieu tham so hoa- parameterized testing   
    @Test
    public void checkFactorialGivenRightArgumentReturnswell() {
        assertEquals(expected, getFactorial(input));
    }

}
