package demo.中介者;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/1 9:19 下午
 * @company 红尘互娱创意文化
 */
public abstract class AbstractMediator {

  protected Purchase purchase;
  protected Sale sale;
  protected Stock stock;

  public AbstractMediator(){
      purchase=new Purchase(this);
      sale=new Sale(this);
      stock=new Stock(this);
  }

  public abstract void execute(String str, Object...objects);

}
