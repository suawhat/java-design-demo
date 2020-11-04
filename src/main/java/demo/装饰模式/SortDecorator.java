package demo.装饰模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 4:37 下午
 * @company 红尘互娱创意文化
 */
public class SortDecorator extends Decorator{

  public SortDecorator(SchoolReport schoolReport) {
    super(schoolReport);
  }

  private void sort(){
    System.out.println("本次排名第1");
  }

  @Override
  void report() {
    this.sort();
    super.report();
  }
}
