package demo.解释器模式;

import java.util.HashMap;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/3 5:26 下午
 * @company 红尘互娱创意文化
 */
public class SymbolExpression extends Expression{
 //抽象运算符号解释器

  protected Expression left;
  protected Expression right;


  public SymbolExpression(Expression left,Expression right){
     this.left=left;
     this.right=right;
  }

  @Override
  public int interpreter(HashMap<String, Integer> var) {
    return 0;
  }
}
