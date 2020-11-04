package demo.中介者;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/1 9:18 下午
 * @company 红尘互娱创意文化
 */
public class Purchase extends AbstractCollege{

  public Purchase(AbstractMediator abstractMediator){
    super(abstractMediator);
  }

  public void buyComputer(int num){
    super.mediator.execute("purchase.buy",num);
  }

  public void refuseBuyComputer(){
    System.out.println("不用再采购电脑了");
  }

}
