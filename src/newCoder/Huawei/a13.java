package newCoder.Huawei;

import java.util.Scanner;

/**
 * Created by hc on 2017/11/13.
 * 题目描述
 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class a13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        for(int i = str.length-1; i>=0; i--){
            if(i==0){
                System.out.print(str[i]);
            }else {
                System.out.print(str[i] + " ");
            }
        }
    }
}
