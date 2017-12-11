package newCoder.Huawei;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

/**
 * Created by hc on 2017/11/15.
 * 题目描述
 给定n个字符串，请对n个字符串按照字典序排列。
 输入描述:
 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 输出描述:
 数据输出n行，输出结果为按照字典序排列的字符串。
 注意：是字典顺序，每个字符区分大小写  并为每个字符排序

 2>字符串排序(先大写后小写)：
 String[] strArray = new String[]{"Z", "a", "D"};
 Arrays.sort(strArray);
 System.out.println(Arrays.toString(strArray));
 3>字符串字母表排序(忽略大小写)
 Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);
 4>反向排序
 Arrays.sort(strArray, Collections.reverseOrder());
 */
public class a14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = Integer.parseInt(sc.nextLine());
        int count = 0;
        String[] arr  = new String[nums];
        //int max = 0;
        while(count != nums){
            arr[count] = sc.nextLine();
            count++;
        }

        //System.out.println(arr.length);
        //System.out.println(arr[1]);
        Arrays.sort(arr);
        for(int i = 0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
//        int count2 =0;
//        for(int i = 65; i<=122; i++){
//            for(int j = 0; j <arr.length; j++){
//                if(Integer.valueOf(arr[j].charAt(0)) == i){
//                    System.out.println(arr[j]);
//                    count2++;
//                }
//                if(count2 == arr.length)
//                    return;
//            }
//        }
        //System.out.println(Integer.valueOf(toLowerCase("asd".charAt(0))) == 97);
    }
}
