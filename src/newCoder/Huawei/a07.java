package newCoder.Huawei;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by hc on 2017/9/25.
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * 难度：简单
 * 学习第二种方法
 */
public class a07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextFloat()){
            float num = sc.nextFloat();
            /*
            if(num - (int)num >= 0.5){
                System.out.println((int)num + 1);
            }else {
                System.out.println((int)num);
            }*/

            BigDecimal i=new BigDecimal(num).setScale(0, BigDecimal.ROUND_HALF_UP);

            System.out.println(i);

            /*Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                float a = sc.nextFloat();
                System.out.println(Math.round(a));
            }*/
        }
    }
}
