package demo.装饰模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 4:41 下午
 * @company 红尘互娱创意文化
 */
public class d1 {

  public static void main(String[] args) {
    SchoolReport schoolReport;

    //原对象
    schoolReport=new FatherGradeSchoolReport();

    //装饰后的对象
    schoolReport=new HighScoreDecorator(schoolReport);

////装饰后的对象
    schoolReport=new SortDecorator(schoolReport);

    schoolReport.report();
    schoolReport.sign("张三");
  }
}
