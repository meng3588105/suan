package com.mmm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Suan {


    /**
     * 鸡兔同笼
     * <p>
     * 有鸡兔共50头，共120只脚
     * 问  鸡兔共多少只
     */
    @Test
    public void suan() {
        int x;
        int y;
        for (x = 0; x <= 50; x++) {

            y = 50 - x; //算出兔子的只数
            if (2 * x + 4 * y == 120) {
                System.out.println(x);
                System.out.println(y);
            }
        }
    }

    /**
     * 韩信点兵
     * <p>
     * 韩信只知道部队有1000多人 但是具体数据不详
     * 5人一组，剩1人
     * 7人一组，剩2人
     * 8人一组，剩3人
     */
    @Test
    public void suan2() {
        int a;
        for (a = 1000; a < 2000; a++) {
            if (a % 5 == 1 && a % 7 == 2 && a % 8 == 3) {
                System.out.println("韩信有部下:" + a);
            }
        }

    }

    /**
     * 需要找零8元
     * 有零钞5元 、2元、1元、5角
     * <p>
     * 求出所有的找零方案
     */
    @Test
    public void suan3() {
        for (int i = 0; i <= 80 / 50; i++) {
            for (int j = 0; j <= 80 / 20; j++) {
                for (int k = 0; k <= 80 / 10; k++) {
                    for (int l = 0; l < 80 / 5; l++) {
                        if (i * 50 + j * 20 + k * 10 + l * 5 == 80) {
                            System.out.println("5元的有：==" + i + "==》2元的有：==" + j + "==》1元的有==" + k + "==》5角的有==" + l);
                        }
                    }
                }
            }
        }
    }


    /**
     * 数字自身平方的尾数=自身(100W以内)
     * 0 0
     * 1 1
     * 2 4
     * 3 9
     * 4 16
     * 5 25
     * 6 36
     * 7 49
     * 8 64
     * 9 81
     */
    @Test
    public void suan4(){
        for (int i = 0; i <1000000 ; i++) {
            //得到i的平方
            int n=i*i;
            if (n%10==i||n%100==i||n%1000==i||n%10000==i||n%100000==i||n%1000000==i){
                System.out.println("数字本身是："+i+"===>平方"+n);
            }
        }
        /**
         数字本身是：0===>平方0
         数字本身是：1===>平方1
         数字本身是：5===>平方25
         数字本身是：6===>平方36
         数字本身是：25===>平方625
         数字本身是：76===>平方5776
         数字本身是：376===>平方141376
         数字本身是：625===>平方390625
         数字本身是：9376===>平方87909376

         发现只有0 1 5 6 满足
         */

    }

    @Test
    public void suan04(){
        //设置时间点
        long begin=System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            //得到i的平方
            int n=i*i;
            int m=i%10;  //得到每个数字的尾数
            if (m!=0 &&m!=1 && m!=5 && m!=6){continue;}//剪枝
            if (n%10==i||n%100==i||n%1000==i||n%10000==i||n%100000==i||n%1000000==i){
                System.out.println("数字本身是："+i+"===>平方"+n);
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("总耗时"+(end-begin));
    }

    /**
     * 给定一个指定的年数
     *  判断是否为 闰年
     *  2000
     *
     *  除以4=0，除以400=0，除以100！=0
     *
     */
    @Test
    public void suan01(){

        //定义年数
        int year=2000;

        boolean flag=year%4==0 && year%100!=0 || year%400==0;//不建议使用 可读性差
        System.out.println(flag);

    }

    @Test
    public void suan02(){

        //定义年数
        int year=1999;

        boolean flag=false; //假设修正法
        if (year%4==0) flag=true;
        if (year%100==0) flag=false;
        if (year%400==0) flag=true;
        System.out.println(flag);

    }

    /**
     * 求三个数字的最大值
     */
    @Test
    public void suan03(){
        //定义3个数字
        int a=2018;
        int b=20;
        int c=18;

        //假设最大值是a
        int max=a;
        if (b>a) max=b;
        if (c>b) max=c;

        System.out.println(max);


    }


    /**

          *
         * *
        * * *
       * * * *
      * * * * *

        常数变易法

     */
    @Test
    public void suan5() {

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 9 - j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j + 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    /**
     *          A
     *         ABA
     *        ABCBA
     *       ABCDCBA
     *      ABCDEDCBA
     *
     *      常数变易法
     */
    @Test
    public void suan6() {

        for (int j=0;j<5;j++){//行数
            for (int i = 0; i <8-j ; i++) System.out.print(" ");
            for (int i = 0; i <=j ; i++) System.out.print((char) ('A'+i));
            for (int i = j-1; i >=0 ; i--) System.out.print((char) ('A'+i));

            System.out.println();

        }
/*//第一行
        for (int j = 0; j < 10; j++) System.out.print(" ");         //每行空格
        for (int i = 0; i < 0; i++) System.out.print((char) ('A' + i));//每行前半部分
        for (int i = 0; i >= 0; i--) System.out.print((char) ('A' + i));//每行后半部分
        System.out.println();
//第二行
        for (int j = 0; j < 9; j++) System.out.print(" ");
        for (int i = 0; i < 1; i++) System.out.print((char) ('A' + i));
        for (int i = 1; i >= 0; i--) System.out.print((char) ('A' + i));
        System.out.println();
//第三行
        for (int j = 0; j < 8; j++) System.out.print(" ");
        for (int i = 0; i < 2; i++) System.out.print((char) ('A' + i));
        for (int i = 2; i >= 0; i--) System.out.print((char) ('A' + i));
        System.out.println();
//第四行
        for (int j = 0; j < 7; j++) System.out.print(" ");
        for (int i = 0; i < 3; i++) System.out.print((char) ('A' + i));
        for (int i = 3; i >= 0; i--) System.out.print((char) ('A' + i));
        System.out.println();
//第五行
        for (int j = 0; j < 6; j++) System.out.print(" ");
        for (int i = 0; i < 4; i++) System.out.print((char) ('A' + i));
        for (int i = 4; i >= 0; i--) System.out.print((char) ('A' + i));
        System.out.println();
//第六行
        for (int j = 0; j < 5; j++) System.out.print(" ");
        for (int i = 0; i < 5; i++) System.out.print((char) ('A' + i));
        for (int i = 5; i >= 0; i--) System.out.print((char) ('A' + i));*/

    }

    /**
     * 一刀切法上式：事先修正
     * String num = "ac ab,af ad,ae";
     * 获取每一个字符串
     */
    @Test
    public void test() {
        String num = "ac ab,af ad,ae";
        String result="";//记录最终结果
        num+=",";//ae后面没有，或者‘ ’我们都统一加上，或者‘ ’。目的是都一样
        for (int i = 0; i <num.length() ; i++) {
            char c=num.charAt(i);
            if (c==' '||c==','){
                System.out.println(result);
                result="";
            }else{
                result+=c;
            }
        }
    }

    /**
     * 一刀切法下式：事后修正
     * String num = "abcde";
     * 把字符串变成 a,b,c,d,e
     */
    @Test
    public void test2() {

        String num = "abcde";
        String result="";
        for (int i = 0; i <num.length(); i++) {
            result+=","+num.charAt(i);
        }
        result=result.substring(1);
        System.out.println(result);
    }

    /**
     * 判断一个字符串中的字母是否有重复
     *
     *  String srt = "asdfgghh";
     *
     *  有重复为true
     *  没有重复为false
     */
    @Test
    public void suan06(){

        String srt = "asdfgghh";
        //正则表达式
        System.out.println(srt.matches(".*(.).*\\1.*"));

    }



    /**
     * 5 53
     * 8 65
     * 6 54
     * 2 50
     * 1 49
     * 0 48
     */
    @Test
    public void test07(){
        String str ="5862";
        int num =str.charAt(0)-'0';
        num=num*10+str.charAt(1)-'0';
        num=num*10+str.charAt(2)-'0';
        num=num*10+str.charAt(3)-'0';
        System.out.println(num);


    }

    /**
     * 数字黑洞
     * 4321
     * 最大值-最小值=结果
     * 结果最大值-结果最小值=结果
     * 求最终的数字
     */
    @Test
    public void test08(){
        int num = 1234;
        for (;;) {
            System.out.println(num);
            char[] chars = (num + "").toCharArray();
            //排序
            Arrays.sort(chars);
            int min = 0;
            int max = 0;
            for (int i = 0; i < chars.length; i++) {
                min = min * 10 + (chars[i] - '0');
            }
            for (int i = chars.length - 1; i >= 0; i--) {
                max = max * 10 + (chars[i] - '0');
            }
            int result = max - min;
            if (result == num) break;
            num=result;
        }
    }

    /**
     * 3进制转换为5进制
     *
     * --首先3进制转换为通用的10进制
     * --然后再转换为5进制
     */
    @Test
    public void test09(){


        String str ="20011002";

        int num=0;
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            num=num*3+(c-'0');
        }
        System.out.println(num);//这是3进制对应的10进制
        String result="";//定义结果
        for (;;){
            if (num==0) break;
            result=num%5+result; //这是10进制对应的5进制
            num=num/5;
        }
        System.out.println(result);







    }



}
