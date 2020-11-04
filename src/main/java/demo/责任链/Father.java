package demo.责任链;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 3:12 下午
 * @company 红尘互娱创意文化
 */
public class Father extends Handler{

  public Father() {
    super(Handler.FATHER_LEVEL);
  }

  @Override
  protected void response(IWomen iWomen) {
    System.out.println("women 向father 请示 ");
    System.out.println(iWomen.getRequest());
    System.out.println("father 回答的是 yes");
  }
}
