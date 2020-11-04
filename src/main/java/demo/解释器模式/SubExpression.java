package demo.解释器模式;

import java.util.HashMap;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/3 5:29 下午
 * @company 红尘互娱创意文化
 */
public class SubExpression extends SymbolExpression{

  public SubExpression(Expression left, Expression right) {
    super(left, right);
  }

  @Override
  public int interpreter(HashMap<String, Integer> var) {
    return super.left.interpreter(var)-super.right.interpreter(var);
  }
}
