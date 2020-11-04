package demo.模版;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 11:12 下午
 * @company 红尘互娱创意文化
 */
public class HummerH1Model extends HummerModel{

  private boolean alarmFlag=true;

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
    return alarmFlag;
  }

  public void setAlarmFlag(Boolean flag){
    this.alarmFlag=flag;
  }


  public static void main(String[] args) {
    HummerH1Model hummerModel=new HummerH1Model();
    hummerModel.setAlarmFlag(false);
    hummerModel.run();
  }
}
