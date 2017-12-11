package newCoder.Huawei;


import java.util.Scanner;

import static java.lang.Character.isDigit;

/**
 * Created by hc on 2017/11/8.
 * 题目描述
 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 输入描述:
 输入一个int型整数
 输出描述:
 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 */
public class a09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        char[] nums = number.toCharArray();
        char[] nums2 = new char[nums.length];
        nums2[0] = nums[nums.length-1];

        //ArrayList<Character> list = new ArrayList<>();
        //list.add(nums[nums.length-1]);
        //System.out.println(nums2);
        for(int i = number.length()-2; i>=0; i--){
            boolean repeat = false;
            int count = 0;
            for(int j = 0; j<nums2.length-1; j++){
                //System.out.println(list.get(j-1));
                if(nums[i] == nums2[j]){
                    repeat = true;
                    break;
                }else if(!isDigit(nums2[j])){     //char的方法
                    break;
                }else {
                    count++;
                }
            }
            if (repeat == false){
                nums2[count] = nums[i];
            }
        }
        System.out.println(nums2);

    }
}
