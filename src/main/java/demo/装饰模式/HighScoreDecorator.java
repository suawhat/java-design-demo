package demo.装饰模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 4:37 下午
 * @company 红尘互娱创意文化
 */
public class HighScoreDecorator extends Decorator{

  public HighScoreDecorator(SchoolReport schoolReport) {
    super(schoolReport);
  }

  private void reportHighScore(){
    System.out.println("本次最高分60");
  }

  @Override
  void report() {
    this.reportHighScore();
    super.report();
  }
}
