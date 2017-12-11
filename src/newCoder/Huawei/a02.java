package newCoder.Huawei;

import java.util.Scanner;

/**
 * Created by hc on 2017/9/11.
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * 注意读题，题的意思为两次输入
 * 方法一：全部转为大写
 * 方法二：比较时忽略大小写，将字符串转换为字符数组计算长度循环，要在转换为字符串
 *
 * 注意string的toUppercase,toCharArray(字符串String转字符数组char[]),valueOf（字符数组转字符串）
 * equalsIgnoreCase(忽略大小写的判断)
 */
public class a02 {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String str = sc.nextLine().toUpperCase();
        char target = sc.nextLine().toUpperCase().toCharArray()[0];

       for(int i = 0; i< str.length(); i++){
           if(str.charAt(i) == target){
               count ++;
           }

       }
        System.out.println(count);
    }*/

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String all = "";
        String one = "";
        char[] ac;
        char temp;
        int num = 0;
        while (s.hasNext()) {
        //s.toUpperCase(),String 转化为大写
        //s.toLowerCase(),String 转化为小写
        //String字符转换，s.toCharArray()与s.charAt(index)
        //char字符转换，String.valueOf(c)转化为String
            all = s.nextLine();
            one = s.nextLine();
        //存放原来所有的
            ac = all.toCharArray();
        //存放要的字符
        //temp=one.charAt(0);
            for (int i = 0; i < ac.length; i++) {
                if (one.equalsIgnoreCase(String.valueOf(ac[i])))
                    num++;
            }
            System.out.println(num);
        }
    }
}



