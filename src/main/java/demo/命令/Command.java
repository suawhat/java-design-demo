package demo.命令;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 2:30 下午
 * @company 红尘互娱创意文化
 */
public abstract class Command {

  protected CodeGroup codeGroup=new CodeGroup();

  protected RequireGroup requireGroup=new RequireGroup();

  /**
   * 执行命令接口
   */
  public abstract void execute();

}
