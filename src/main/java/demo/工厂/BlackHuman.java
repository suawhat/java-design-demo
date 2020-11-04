package demo.工厂;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 10:31 下午
 * @company 红尘互娱创意文化
 */
public abstract class BlackHuman implements Human{

  @Override
  public void talk() {
    System.out.println("black talk");
  }

  @Override
  public void getColor() {
    System.out.println("black color");
  }
}
