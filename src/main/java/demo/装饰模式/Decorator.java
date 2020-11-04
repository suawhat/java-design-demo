package demo.装饰模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 4:35 下午
 * @company 红尘互娱创意文化
 */
public class Decorator extends SchoolReport{

  private final SchoolReport schoolReport;

  public Decorator(SchoolReport schoolReport){
    this.schoolReport=schoolReport;
  }

  @Override
  void report() {
   this.schoolReport.report();
  }

  @Override
  void sign(String name) {
    this.schoolReport.sign(name);
  }
}
