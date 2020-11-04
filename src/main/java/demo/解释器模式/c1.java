package demo.解释器模式;

import java.util.HashMap;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/3 5:41 下午
 * @company 红尘互娱创意文化
 */
public class c1 {

  public static void main(String[] args) {
    HashMap<String,Integer> var=new HashMap<>();
    var.put("a",10);
    var.put("b",1);
    var.put("c",2);
    var.put("d",3);
    String expStr="a+b-c+d";
    Calculator c=new Calculator(expStr);

    System.out.println("运算表达式："+expStr);
    System.out.println("运算的结果："+c.run(var));

  }
}
