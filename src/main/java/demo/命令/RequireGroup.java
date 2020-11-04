package demo.命令;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 2:27 下午
 * @company 红尘互娱创意文化
 */
public class RequireGroup extends Group{

  @Override
  void add() {
    System.out.println("RequireGroup   and");
  }

  @Override
  void delete() {
    System.out.println("RequireGroup   delete");
  }
}
