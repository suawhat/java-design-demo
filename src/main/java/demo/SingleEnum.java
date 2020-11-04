package demo;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 9:36 下午
 * @company 红尘互娱创意文化
 */
public enum  SingleEnum {

  /**
   * 枚举单俐模式
   */
  INSTANCE;

  private  final SingleMode instance;

  SingleEnum(){
    instance=new SingleMode();
  }

  public SingleMode getInstance(){
    return instance;
  }



}
