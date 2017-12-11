package newCoder.Huawei;

import java.util.Scanner;

/**
 * Created by hc on 2017/11/16.
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 输入描述:
 输入一个整数（int类型）
 输出描述:
 这个数转换成2进制后，输出1的个数
 */
public class a15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        String y = Integer.toBinaryString(x);
        char[] arr = y.toCharArray();
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == '1'){
                count++;
            }
        }
//        其他方法（nextInt）：
//        while (n!=0){
//            count++;
//            n=n&(n-1);       //两位结果都为1才为1，二进制比较
//        }
//
//        while(n>0){
//            if((n&1)>0){
//                count++;
//            }
//            n=n>>1;
//        }

        System.out.println(count);
    }
}
