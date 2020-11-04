package demo.中介者;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/1 9:16 下午
 * @company 红尘互娱创意文化
 */
public abstract class AbstractCollege {

   protected AbstractMediator mediator;
   public AbstractCollege(AbstractMediator abstractMediator){
      this.mediator=abstractMediator;
   }

}
