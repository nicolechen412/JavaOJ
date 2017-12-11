package newCoder.Huawei;



import java.util.*;

/**
 * Created by hc on 2017/9/25.
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 输入描述:
 先输入键值对的个数
 然后输入成对的index和value值，以空格隔开
 输出描述:
 输出合并后的键值对（多行）
 输入

 4
 0 1
 0 2
 1 2
 3 4
 输出

 0 3
 1 2
 3 4

 难度：一般
 */
public class a08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new TreeMap<>();
        while(sc.hasNext()) {
            int count = sc.nextInt();
            for(int i = 0; i<count; i++){
                /*String[] arr = sc.nextLine().split(" ");
                int key = Integer.parseInt(arr[0]);
                int value = Integer.parseInt(arr[1]);*/
                //nextInt 不能识别空格，要输入不换行的两个数字直接使用两次nextInt
                int key = sc.nextInt();
                int value = sc.nextInt();
                if(map.containsKey(key)){
                    int sum = map.get(key) + value;
                    map.put(key, sum);
                }else {
                    map.put(key, value);
                }
            }
           /*Set<Integer> set = map.keySet();
            for(Integer s: set){*/
           for(Integer s : map.keySet()){//获取集合中所有键的集合
                System.out.println(s + " " + map.get(s));
            }
        }
    }
}
