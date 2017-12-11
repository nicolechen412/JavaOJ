package newCoder.Huawei;

import java.util.Scanner;

/**
 * Created by hc on 2017/9/15.
 * 连续输入字符串(输入2次,每个字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组； 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *：活用substring。不足8位在后面补数字8：可以补足0，然后substring。
 * 学会用Java的方法
 */
public class a04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            split(sc.nextLine());
        }
    }

    public static void split(String s){
        while(s.length()>=8){
            System.out.println(s.substring(0,8));
            s = s.substring(8);
        }
        if(s.length() < 8 && s.length() > 0){
            String str = s+"00000000";
            System.out.println(str.substring(0,8));

        }
    }
}



















/*import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            String s=scanner.nextLine();
            split(s);
        }
    }

    public static void split(String s){
        while(s.length()>=8){
            System.out.println(s.substring(0, 8));
            s=s.substring(8);
        }
        if(s.length()<8&&s.length()>0){
            s=s+"00000000";
            System.out.println(s.substring(0, 8));
        }
    }


}
*/
