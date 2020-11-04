package demo.模版;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 11:08 下午
 * @company 红尘互娱创意文化
 */
public abstract class HummerModel {

  protected abstract void start();

  protected abstract void stop();

  protected abstract void alarm();

  protected abstract void  engineBoom();

  final void run(){
    start();
    stop();
    if(this.isAlarm()){
      alarm();
    }

    engineBoom();
  }

  /**
   * 钩子方法控制业务逻辑
   * @return
   */
  protected  boolean isAlarm(){
    return true;
  }

}
