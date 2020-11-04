package demo.策略模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 5:38 下午
 * @company 红尘互娱创意文化
 */
public class c1 {

  public static void main(String[] args) {

    //使用枚举的策略
    System.out.println(Calculator1.ADD.exec(10,1));

    //使用context的策略

    AddCalculator addCalculator=new AddCalculator();
    Context context=new Context(addCalculator);

    System.out.println(context.exec(10,1));

  }

}
