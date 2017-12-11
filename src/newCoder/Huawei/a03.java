package newCoder.Huawei;


import java.util.*;

/**
 * Created by hc on 2017/9/15.
 * 输入多行，先输入随机整数的个数，再输入相应个数的整数
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，
 * 然后再把这些数从小到大排序。
 *
 * 注意题中会重复输入多组数据 所以我们要在while循环中对它进行去重和排序。
 * 注意有一些排序的方法和集合
 *
 * 方法二的Treeset集合不仅可以排序还会去重
 *
 */
public class a03 {
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       while(sc.hasNext()){
           int inputParam = sc.nextInt();
           int[] inputArray = new int[inputParam];
           for(int x = 0; x<inputParam; x++){
               inputArray[x] = sc.nextInt();
           }
           Arrays.sort(inputArray);
           System.out.println(inputArray[0]);
           for(int x = 1; x < inputParam; x++){
               if(inputArray[x] != inputArray[x-1]){
                   System.out.println(inputArray[x]);
               }
           }
       }

    }*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int inputParam = sc.nextInt();
            Set<Integer> set = new TreeSet<>();
            for(int x = 0; x<inputParam; x++){
                set.add(sc.nextInt());
            }
            for(Integer i: set){
                System.out.println(i);
            }

        }

    }
}
