package demo.模版;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 11:12 下午
 * @company 红尘互娱创意文化
 */
public class HummerH2Model extends HummerModel{


  @Override
  protected void start() {
    System.out.println("start    ");
  }

  @Override
  protected void stop() {
    System.out.println("stop    ");
  }

  @Override
  protected void alarm() {
    System.out.println("alarm    ");
  }

  @Override
  protected void engineBoom() {
    System.out.println("engineBoom    ");
  }

  @Override
  protected boolean isAlarm(){
    return false;
  }




  public static void main(String[] args) {
    HummerH2Model hummerModel=new HummerH2Model();
    hummerModel.run();
  }
}
