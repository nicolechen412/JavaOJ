package newCoder.Huawei;

import java.util.Scanner;

/**
 * @author NicoleChen
 * @date 2017/12/6 16:36
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。 如：输入“I am a student”，输出“tneduts a ma I”。

 */
public class a19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] arr = sc.nextLine().split(" ");
            for (int i = arr.length-1; i >=0 ; i--) {
                char[] arr2 = arr[i].toCharArray();
                for (int j = arr[i].length()-1; j >=0 ; j--) {
                    System.out.print(arr2[j]);
                }
                if(i != 0){
                    System.out.print(" ");
                }

            }
        }
    }
}
