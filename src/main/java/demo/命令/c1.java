package demo.命令;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 2:36 下午
 * @company 红尘互娱创意文化
 */
public class c1 {

  public static void main(String[] args) {
    Invoker invoker=new Invoker();
    Command command=new AddCodeCommand();
    invoker.setCommand(command);

    invoker.action();

  }

}
