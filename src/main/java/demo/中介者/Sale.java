package demo.中介者;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/1 9:18 下午
 * @company 红尘互娱创意文化
 */
public class Sale extends AbstractCollege{

  public Sale(AbstractMediator abstractMediator){
    super(abstractMediator);
  }

  public void sellComputer(int number){
    super.mediator.execute("sale.sell",number);
    System.out.println("销售电脑"+number+"台");
  }


}
