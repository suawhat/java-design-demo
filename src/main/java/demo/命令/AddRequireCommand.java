package demo.命令;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 2:33 下午
 * @company 红尘互娱创意文化
 */
public class AddRequireCommand extends Command{

  @Override
  public void execute() {
      super.requireGroup.add();
      super.requireGroup.delete();
  }
}
