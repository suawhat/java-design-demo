package demo.责任链;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 3:15 下午
 * @company 红尘互娱创意文化
 */
public class Husband extends Handler{

  public  Husband(){
    super(Handler.HUSBAND_LEVEL);
  }

  @Override
  protected void response(IWomen iWomen) {

    System.out.println("women Husband 请示 ");
    System.out.println(iWomen.getRequest());
    System.out.println("Husband 回答的是 yes");

  }
}
