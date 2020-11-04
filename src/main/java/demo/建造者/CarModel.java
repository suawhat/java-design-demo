package demo.建造者;

import java.util.ArrayList;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 11:08 下午
 * @company 红尘互娱创意文化
 */
public abstract class CarModel {

  private ArrayList<String> sequence=new ArrayList<>();
  protected abstract void start();

  protected abstract void stop();

  protected abstract void alarm();

  protected abstract void  engineBoom();

  final void run(){
    for(String s:sequence){
      if("start".equalsIgnoreCase(s)){
        start();
      }
      if("stop".equalsIgnoreCase(s)){
        stop();
      }
      if("alarm".equalsIgnoreCase(s)){
        alarm();
      }
      if("boom".equalsIgnoreCase(s)){
        engineBoom();
      }
    }

  }

  final public void setSequence(ArrayList<String> sequence){
    this.sequence=sequence;
  }


}
