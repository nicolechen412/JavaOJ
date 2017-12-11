package newCoder.Huawei;

import java.util.Scanner;

/**
 * Created by hc on 2017/9/18.
 * 接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 * ASCII的字符代表的数值，Math.pow 次方函数
 */

public class a05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(func(s.substring(2)));
        }
    }

    public static int func(String s){
        int i = 0, n = 0;
        int count = 0;
        char c;
        while (count < s.length()){
            c = s.charAt(s.length()-1-count);
            if(c >='0' && c <= '9'){
                i = c - '0' -1;
            } else if(c >= 'A' && c <= 'F'){
                i = c - 'A' + 10;
            }
            n += i * Math.pow(16,count);
            count++;
        }
        return n;
    }
}
