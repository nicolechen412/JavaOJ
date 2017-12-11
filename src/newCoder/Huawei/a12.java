package newCoder.Huawei;

import java.util.Scanner;

/**
 * Created by hc on 2017/11/13.
 * 题目描述
 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：
 输入描述:
 输入N个字符
 输出描述:
 输出该字符串反转后的字符串
 */
public class a12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        for(int i = arr.length-1; i>= 0 ; i--){
            System.out.print(arr[i]);
        }
    }
}
