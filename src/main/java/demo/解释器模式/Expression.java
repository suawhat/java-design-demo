package demo.解释器模式;

import java.util.HashMap;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/3 5:09 下午
 * @company 红尘互娱创意文化
 */
public abstract class Expression {

  /**
   * 解析公式和数值
   * @param var
   * @return
   */
   public abstract int interpreter(HashMap<String,Integer> var);

}
