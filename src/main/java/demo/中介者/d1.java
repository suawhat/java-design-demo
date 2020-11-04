package demo.中介者;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/1 9:47 下午
 * @company 红尘互娱创意文化
 */
public class d1 {

  public static void main(String[] args) {
    AbstractMediator abstractMediator=new Mediator();

    System.out.println("采购人员开始采购电脑");

    Purchase purchase=new Purchase(abstractMediator);

    purchase.buyComputer(100);

    System.out.println("销售人员开始销售电脑");

    Sale sale =new Sale(abstractMediator);

    sale.sellComputer(10);

    System.out.println("库存人员开始清理库存");

    Stock stock =new Stock(abstractMediator);

    stock.decrease(10);


  }

}
