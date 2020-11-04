package demo.策略模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 5:25 下午
 * @company 红尘互娱创意文化
 */
public class Context {

  /**
   * ●Context封装角色它也叫做上下文角色，起承上启下封装作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
   */
  private Calculator calculator=null;

  public Context(Calculator calculator){
    this.calculator=calculator;
  }

  public int exec(int a, int b) {
    return this.calculator.exec(a, b);
  }

}
