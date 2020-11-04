package demo.命令;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 2:34 下午
 * @company 红尘互娱创意文化
 */
public class AddCodeCommand extends Command{

  @Override
  public void execute() {
    super.codeGroup.add();
    super.codeGroup.delete();
  }
}
