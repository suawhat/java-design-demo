package demo.中介者;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/1 9:18 下午
 * @company 红尘互娱创意文化
 */
public class Stock extends AbstractCollege{

    public Stock(AbstractMediator abstractMediator){
      super(abstractMediator);
    }

    private static int computerNUmber=100;

    //增加库存
    public void increase(int number){
      computerNUmber=computerNUmber+number;
      System.out.println("库存数量==="+computerNUmber);
    }
    //减库存
    public void decrease(int number){
      computerNUmber=computerNUmber-number;
      System.out.println("库存数量==="+computerNUmber);
    }

    //获取库存数量
    public int getComputerNUmber(){
      return computerNUmber;
    }

    //清库存
  public void clearStock(){
      super.mediator.execute("stock.clear");
  }





}
