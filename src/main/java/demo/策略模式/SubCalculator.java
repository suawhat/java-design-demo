package demo.策略模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 5:23 下午
 * @company 红尘互娱创意文化
 */
public class SubCalculator implements Calculator{

  @Override
  public int exec(int a, int b) {
    return a-b;
  }
}
