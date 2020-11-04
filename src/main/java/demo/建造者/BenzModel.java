package demo.建造者;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 11:46 下午
 * @company 红尘互娱创意文化
 */
public class BenzModel extends CarModel{

  @Override
  protected void start() {
    System.out.println("benzStart");
  }

  @Override
  protected void stop() {
    System.out.println("benzStop");
  }

  @Override
  protected void alarm() {
    System.out.println("benzAlarm");
  }

  @Override
  protected void engineBoom() {
    System.out.println("benzBoom");
  }
}
