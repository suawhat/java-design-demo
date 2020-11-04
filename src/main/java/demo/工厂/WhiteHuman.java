package demo.工厂;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 10:32 下午
 * @company 红尘互娱创意文化
 */
public abstract class WhiteHuman implements Human{

  @Override
  public void talk() {
    System.out.println("white talk");
  }

  @Override
  public void getColor() {
    System.out.println("white color");
  }
}
