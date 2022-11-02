package com.algorithm.test;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EvaluateTest {
    public static void main(String[] args) {

        Stack<String> ope = new Stack<String>(); //操作符栈
        Stack<Double> val = new Stack<Double>(); //操作数栈

        while (!StdIn.isEmpty()){  //输入不为空时

            String s = StdIn.readString();  //读取输入的字符
            if(s.equals("(")){ //如果是左括号，忽略

            }else if (s.equals("+")){
                //入栈
                ope.push(s);
            }else if (s.equals("-")){
                ope.push(s);
            }else if (s.equals("*")){
                ope.push(s);
            }else if (s.equals("/")){
                ope.push(s);   //入栈
            }else if (s.equals("sqrt")){
                ope.push(s);
            }else if (s.equals(")")){
                //右括号
                String op = ope.pop();  //弹出操作符
                double v = val.pop();  //弹出操作数
                if (op.equals("+")){
                    v += val.pop();
                }else if (op.equals("-")){
                    v -= val.pop();
                }else if (op.equals("*")){
                    v *= val.pop();
                }else if (op.equals("/")){
                    v /= val.pop();
                }else if (op.equals("sqrt")){
                    v = Math.sqrt(v);  //平方
                }
                //结果入栈
                val.push(v);

            }
            else {
                //输入的是数字,直接入栈
                val.push(Double.parseDouble(s));  //将字符转转换成数字
            }
        }

        StdOut.println(val.pop());
    }
}
