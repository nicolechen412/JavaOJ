package newCoder.Huawei;

import java.util.Scanner;

/**
 * Created by hc on 2017/9/10.
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 注意nextline、hasnextline和lastindexof的用法
 */
public class a01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;
        while (sc.hasNextLine()){
            str = sc.nextLine();
            System.out.println(str.length() - 1 -str.lastIndexOf(" "));

        }
    }
}
