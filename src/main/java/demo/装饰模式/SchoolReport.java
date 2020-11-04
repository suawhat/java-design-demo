package demo.装饰模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 4:29 下午
 * @company 红尘互娱创意文化
 */
public abstract class SchoolReport {

  /**
   * 查看成绩单
   */
  abstract void report();

  /**
   * 家长签字
   */
  abstract void sign(String name);

}
