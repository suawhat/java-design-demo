package demo.桥梁模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/4 5:08 下午
 * @company 红尘互娱创意文化
 */
public class Pad extends Product{

  @Override
  public void producted() {
    System.out.println("生产pad。。。。。。");
  }

  @Override
  public void selled() {
    System.out.println("销售pad。。。。。。");
  }
}
