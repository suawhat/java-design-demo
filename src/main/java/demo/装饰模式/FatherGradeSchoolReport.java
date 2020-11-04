package demo.装饰模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 4:31 下午
 * @company 红尘互娱创意文化
 */
public class FatherGradeSchoolReport extends SchoolReport{

  @Override
  void report() {
    System.out.println("开始成绩60");
    System.out.println("请家长签字");
  }

  @Override
  void sign(String name) {
    System.out.println("家长签字："+name);
  }
}
