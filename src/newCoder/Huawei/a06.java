package newCoder.Huawei;

import java.util.Scanner;

/**
 * Created by hc on 2017/9/20.
 * 输入一个long正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ），最后一个数后面也要有空格。函数接口说明：
 public String getResult(long ulDataInput)
 输入参数：
 long ulDataInput：输入的正整数
 返回值：
 String
 * 这个问题的意思，其实就是让你把输入的整数因式分解，只不过因子必须都是质数
 例如：180 = 2 * 2 * 3 * 3 * 5；90 = 2 * 3 * 3 * 5；而不是找出所有的质数因子
 */
public class a06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    while(sc.hasNextLong()) {
        long num = sc.nextLong();
        System.out.println(getResult(num));
    }

    }
    public static String getResult(long ulDateInput){
        //int i = 1;
        StringBuilder sb = new StringBuilder();
        while(ulDateInput != 1){
            for(int index = 2; index <= ulDateInput; index++){
                if((ulDateInput % index) ==0){
                    sb.append(index).append(" ");
                    ulDateInput = ulDateInput / index;
                    break;
                }
            }
        }
        String s = sb.toString();
        return s;
    }
}
