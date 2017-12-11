package newCoder.Huawei;

import java.util.Scanner;

/**
 * Created by hc on 2017/11/10.
 * 题目描述
 描述：
 输入一个整数，将这个整数以字符串的形式逆序输出
 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001

 输入描述:
 输入一个int整数
 输出描述:
 将这个整数以字符串的形式逆序输出
 */
public class a11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
