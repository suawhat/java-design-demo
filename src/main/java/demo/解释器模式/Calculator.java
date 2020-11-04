package demo.解释器模式;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/3 5:32 下午
 * @company 红尘互娱创意文化
 */
public class Calculator {

  private Expression expression;

  public Calculator(String expStr){
    Stack<Expression> stack=new Stack<>();

    char[] array=expStr.toCharArray();

    Expression left=null;
    Expression right=null;
    for (int i=0;i<array.length;i++){
      switch (array[i]){
        case '+':
          left=stack.pop();
          right=new VarExpression(String.valueOf(array[++i]));
          stack.push(new AddExpression(left,right));
          break;
        case '-':
          left=stack.pop();
          right=new VarExpression(String.valueOf(array[++i]));
          stack.push(new SubExpression(left,right));
          break;
        default:
          stack.push(new VarExpression(String.valueOf(array[i])));


      }
    }

    this.expression=stack.pop();


  }

  public int run(HashMap<String,Integer> var){
    return this.expression.interpreter(var);
  }



}
