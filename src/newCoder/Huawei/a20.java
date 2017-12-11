package newCoder.Huawei;

import java.util.Scanner;

/**
 * @author NicoleChen
 * @date 2017/12/11 21:29
 * 实现四则运算
 * 注意：使用栈
 */
public class a20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            calculate(str);
        }
    }

    private static int calculate(String strExpression) {

        return 0;
    }


    /*public class Main {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line ="";
            while((line=br.readLine().trim())!=null)
            {
                Stack<Character> stack = new Stack<Character>();
                List<Object> list = new ArrayList<Object>();

                for(int i=0;i<line.length();++i)
                {
                    String T="";
                    boolean isN = false;  //负号
                    if(i==0&&line.charAt(i)=='-') {
                        isN = true;
                        ++i;
                    }
                    else if(line.charAt(i)=='-' && (line.charAt(i-1)=='-'||line.charAt(i-1)=='+'||line.charAt(i-1)=='*'||line.charAt(i-1)=='/'||
                            line.charAt(i-1)=='('||line.charAt(i-1)=='['||line.charAt(i-1)=='{'))
                    {
                        isN = true;
                        ++i;
                    }

                    while(i<line.length()&&line.charAt(i)>='0'&&line.charAt(i)<='9')
                        T=T+line.charAt(i++);

                    if(!T.equals("")){
                        --i;
                        if(isN)
                            list.add(0-(new Integer(T)));
                        else
                            list.add(new Integer(T));

                    }
                    else{

                        char op = line.charAt(i);
                        if(op=='+'||op=='-'||op=='*'||op=='/'){
                            if(stack.isEmpty())
                                stack.push(op);
                            else if(isUpperPro(op,(char)stack.peek()))
                                stack.push(op);
                            else {
                                while(!stack.isEmpty() && (stack.peek()!='('||stack.peek()!='['||stack.peek()!='{') && !isUpperPro(op,(char)stack.peek()))
                                    list.add(stack.pop());
                                stack.push(line.charAt(i));
                            }
                        }
                        else if(op=='(' || op=='[' || op=='{'){
                            stack.push(op);
                        }
                        else if(line.charAt(i)==')'){
                            while(stack.peek()!='(')
                                list.add(stack.pop());
                            stack.pop();
                        }
                        else if(line.charAt(i)==']'){
                            while(stack.peek()!='[')
                                list.add(stack.pop());
                            stack.pop();
                        }
                        else if(line.charAt(i)=='}'){
                            while(stack.peek()!='{')
                                list.add(stack.pop());
                            stack.pop();
                        }
                    }
                }
                while(!stack.isEmpty())
                    list.add(stack.pop());

//
//          Iterator<Object> iter = list.iterator();
//          while(iter.hasNext())
//              System.out.print(iter.next());

                //利用后缀表达式计算
                Stack<Integer> Pstack = new Stack<Integer>();
                Iterator<Object> it = list.iterator();
                while(it.hasNext())
                {
                    Object temp = it.next();
                    if(temp instanceof Integer)
                        Pstack.push((Integer)temp);
                    else if(temp instanceof Character)
                    {
                        int N2 = Pstack.pop();
                        int N1 = Pstack.pop();
                        int res = getRes(N1,N2,(char)temp);
                        Pstack.push(res);
                    }
                }
                System.out.println(Pstack.pop());
            }

        }

        private static int getRes(int n1, int n2, char temp) {
            if(temp=='-') return n1-n2;
            if(temp=='+') return n1+n2;
            if(temp=='*') return n1*n2;
            if(temp=='/') return n1/n2;
            return 0;
        }

        private static boolean isUpperPro(char op, char peek) {
            if(peek=='(' || peek=='[' || peek=='{')
                return true;
            if((op=='+'||op=='-')&&(peek=='*'||peek=='/'))
                return false;
            if((op=='*'||op=='/')&&(peek=='+'||peek=='-'))
                return true;
            if((op=='+'||op=='-')&&(peek=='+'||peek=='-'))
                return false;
            if((op=='*'||op=='/')&&(peek=='*'||peek=='/'))
                return false;

            return false;
        }
    }*/
}
