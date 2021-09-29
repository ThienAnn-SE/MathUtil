/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.main;

import com.fu.mathutil.core.MathUtil;

/**
 *
 * @author thien
 */
public class Main {

    public static void main(String[] args) {
        //test manual, dua data, goi ham check, so sanh
        //tat ca, dac biet phan compare la phai bang mat, cho tung tinh huong
        System.out.println("0! = 1? " + MathUtil.getFactorial(0));
        System.out.println("1! = 1? " + MathUtil.getFactorial(1));
        System.out.println("2! = 2? " + MathUtil.getFactorial(2));
        System.out.println("3! = 6? " + MathUtil.getFactorial(3));
        
        
        //CI: 
        //- mac dinh qua trinh bien dich (build .class) va qua trnh dong goi (dist -.war .jar .ear)
        //khong care viec ta co code unittest hay khong, unittest dang xanh/do ko quan tam
        
        // => khong nen ra .jar khi code dang do, chua pas bo test
        //gai tien trinh ra .jar di qua bo test
    }
}
