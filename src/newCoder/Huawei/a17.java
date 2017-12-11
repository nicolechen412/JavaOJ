package newCoder.Huawei;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hc on 2017/11/23.
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。

 输入：

 合法坐标为A(或者D或者W或者S) + 数字（两位以内）

 坐标之间以;分隔。

 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。

 下面是一个简单的例子 如：

 A10;S20;W10;D30;X;A1A;B10A11;;A10;

 处理过程：

 起点（0,0）

 +   A10   =  （-10,0）

 +   S20   =  (-10,-20)

 +   W10  =  (-10,-10)

 +   D30  =  (20,-10)

 +   x    =  无效

 +   A1A   =  无效

 +   B10A11   =  无效

 +  一个空 不影响

 +   A10  =  (10,-10)

 结果 （10， -10）

 输入
 A10;S20;W10;D30;X;A1A;B10A11;;A10;
 输出
 10,-10
 */
public class a17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = null;
        String regEx = "[ADWS]";
        String regEx2 = "[0-9]{1,}";
        Pattern pattern = Pattern.compile(regEx);
        Pattern pattern2 = Pattern.compile(regEx2);
        while(sc.hasNext()){
            int x = 0,y = 0;
            String[] arrs = sc.nextLine().split(";");
            for(int i = 0; i<arrs.length; i++){
                //System.out.println(arrs[i]);
                if(arrs[i].length() >= 2){
                    Matcher m = pattern.matcher(arrs[i].substring(0,1));
                    Matcher m2 = pattern2.matcher(arrs[i].substring(1));
                    if(m.matches() && m2.matches()){
                        if(arrs[i].charAt(0) == 'A'){
                            x -= Integer.parseInt(arrs[i].substring(1));
                        }else if(arrs[i].charAt(0) == 'D'){
                            x += Integer.parseInt(arrs[i].substring(1));
                        }else if(arrs[i].charAt(0) == 'W'){
                            y += Integer.parseInt(arrs[i].substring(1));
                        }else {
                            y -= Integer.parseInt(arrs[i].substring(1));
                        }
                        s = x + "," + y;
                }
                }
            }
            System.out.println(s);
        }
    }


}
