package demo.命令;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 2:34 下午
 * @company 红尘互娱创意文化
 *
 * 统一执行命令的入口
 */
public class Invoker {

  private Command command;

  public void setCommand(Command command){
    this.command=command;
  }

  public void action(){
    this.command.execute();
  }

}
