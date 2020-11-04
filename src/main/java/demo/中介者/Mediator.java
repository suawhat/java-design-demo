package demo.中介者;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/1 9:27 下午
 * @company 红尘互娱创意文化
 */
public class Mediator extends AbstractMediator {

  @Override
  public void execute(String str, Object... objects) {
    if(str.equalsIgnoreCase("purchase.buy")){
        this.buyComputer((Integer) objects[0]);
    }

    if(str.equalsIgnoreCase("sale.sell")){
      this.sellComputer((Integer) objects[0]);
    }

  }

  //采购电脑
  private void buyComputer(int number){
    super.stock.increase(number);
    System.out.println("采购电脑"+number+"台");
  }

  //销售电脑
  public void sellComputer(int number){
    if(super.stock.getComputerNUmber()<number){
      super.purchase.buyComputer(number);
    }

    super.stock.decrease(number);
  }
}
