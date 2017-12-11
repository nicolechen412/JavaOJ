package newCoder.Huawei;

import java.util.HashSet;
import java.util.Scanner;


/**
 * Created by hc on 2017/11/10.
 * 题目描述
 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
 输入描述:
 输入N个字符，字符在ACSII码范围内。
 输出描述:
 输出范围在(0~127)字符的个数。
 */
public class a10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        //int count = 0;
        //char[] arr2 = new char[arr.length];
        HashSet<Character> chars = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(Integer.valueOf(arr[i]) >= 0 && Integer.valueOf(arr[i]) <= 127){
                chars.add(arr[i]);
                //System.out.println(chars);
            }
        }
        System.out.println(chars.size());
    }
}
