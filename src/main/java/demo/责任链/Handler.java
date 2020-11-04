package demo.责任链;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 3:03 下午
 * @company 红尘互娱创意文化
 */
public abstract class Handler {

  public static final int FATHER_LEVEL=1;
  public static final int HUSBAND_LEVEL=2;
  public static final int SON_LEVEL=3;

  private int level=0;

  private Handler nextHandler;

  public Handler(int level){
    this.level=level;
  }

  public final void HandleMessage(IWomen iWomen){

    if(iWomen.getType()==this.level){
       this.response(iWomen);
    }else {
      if(this.nextHandler!=null){
        //请求传递处理
        this.nextHandler.HandleMessage(iWomen);
      }else{
        System.out.println("已经没有人处理了");
      }

    }

  }

  public void setNextHandler(Handler nextHandler) {
    this.nextHandler = nextHandler;
  }

  /**
   * 请求的回应
   * @param iWomen
   */
  protected  abstract void response(IWomen iWomen);

}
