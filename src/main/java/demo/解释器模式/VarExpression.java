package demo.解释器模式;

import java.util.HashMap;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/3 5:23 下午
 * @company 红尘互娱创意文化
 */
public class VarExpression extends Expression{

  private String key;

  public VarExpression(String key){
    this.key=key;
  }

  /**
   * 变量解释器
   * @param var
   * @return
   */
  @Override
  public int interpreter(HashMap<String, Integer> var) {
    return var.get(this.key);
  }
}
